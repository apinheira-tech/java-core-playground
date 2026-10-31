package br.apinheira.threadlocal;

/**
 * Classe que guarda o SecurityContext em uma ThreadLocal e permite
 * executar um trecho de código dentro de um contexto específico,
 * restaurando o contexto anterior ao terminar.
 */
public class SecurityContextRunner {

    // Cada thread enxerga o seu próprio valor. Nada é compartilhado entre threads.
    private static final ThreadLocal<SecurityContext> CONTEXT = new ThreadLocal<>();

    /**
     * Executa 'action' com 'context' ativo na thread atual.
     * Ao final (com sucesso ou com exceção), devolve o contexto que existia antes.
     */
    public void runWithinContext(Runnable action, SecurityContext context) {
        // 1. Guarda o contexto atual (pode ser null se não havia nenhum)
        SecurityContext previous = CONTEXT.get();
        try {
            // 2. Define o novo contexto para esta thread
            CONTEXT.set(context);
            // 3. Executa o código do chamador (roda na MESMA thread, não cria outra)
            action.run();
        } finally {
            // 4. Sempre restaura, mesmo se action.run() lançar exceção
            if (previous == null) {
                CONTEXT.remove();      // não havia contexto: limpa (evita vazamento de memória)
            } else {
                CONTEXT.set(previous); // havia contexto externo: volta a ele
            }
        }
    }

    /** Permite que o código executado dentro do runner consulte o contexto atual. */
    public static SecurityContext current() {
        return CONTEXT.get();
    }
}

  /*  private static final ThreadLocal<SecurityContext> CONTEXT = new ThreadLocal<>();

    void runWithinContext(Runnable action, SecurityContext context) {
        SecurityContext previous = CONTEXT.get();
        try {
            CONTEXT.set(context);
            action.run();
        } finally {
            if (previous == null) {
                CONTEXT.remove();
            } else {
                CONTEXT.set(previous);
            }
        }
    }
}
*/
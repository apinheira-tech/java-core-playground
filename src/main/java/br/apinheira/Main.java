package br.apinheira;

import br.apinheira.threadlocal.SecurityContext;
import br.apinheira.threadlocal.SecurityContextRunner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        SecurityContextRunner runner = new SecurityContextRunner();

        System.out.println("Antes de tudo: " + SecurityContextRunner.current());

        // Contexto externo
        runner.runWithinContext(() -> {
            System.out.println("Externo: " + SecurityContextRunner.current());

            // Contexto aninhado: sobrescreve temporariamente o externo
            runner.runWithinContext(
                    () -> System.out.println("Interno: " + SecurityContextRunner.current()),
                    new SecurityContext("maria", "USER"));

            // Voltou ao externo automaticamente
            System.out.println("De volta ao externo: " + SecurityContextRunner.current());
        }, new SecurityContext("admin", "ADMIN"));

        System.out.println("Depois de tudo: " + SecurityContextRunner.current());

        // Outra thread NÃO enxerga o contexto da main (ThreadLocal é isolada)
        runner.runWithinContext(() -> {
            Thread t = new Thread(() ->
                    System.out.println("Outra thread: " + SecurityContextRunner.current()));
            t.start();
            try { t.join(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }, new SecurityContext("admin", "ADMIN"));

        // Mesmo com exceção, o contexto é restaurado
        try {
            runner.runWithinContext(() -> { throw new RuntimeException("falha"); },
                    new SecurityContext("joao", "USER"));
        } catch (RuntimeException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
        System.out.println("Após exceção: " + SecurityContextRunner.current());
    }
}
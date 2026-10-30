/*
package br.apinheira.javaadvanced.lazycontants;
import java.lang.LazyConstant;

public class ExampleLazyConstants {

        static class ConexaoBanco {
            ConexaoBanco() {
                System.out.println("Abrindo conexão com o banco...");
            }

            void consultar() {
                System.out.println("Executando consulta...");
            }
        }

        private static final LazyConstant<ConexaoBanco> CONEXAO =
                LazyConstant.of(ConexaoBanco::new);

        public static void main(String[] args) {
            System.out.println("Aplicação iniciada.");

            System.out.println("Ainda não acessou o banco.");

            // A conexão é criada somente aqui
            CONEXAO.get().consultar();

            // Reutiliza o mesmo valor já inicializado
            CONEXAO.get().consultar();
        }
    }
}
*/

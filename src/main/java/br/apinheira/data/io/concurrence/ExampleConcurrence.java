/*
package br.apinheira.data.io.concurrence;

import java.util.concurrent.StructuredTaskScope;
// import java.util.concurrent.StructuredTaskScope

public class ExampleConcurrence {

        static String buscarUsuario() {
            return "Usuário: Ana";
        }

        static String buscarPedidos() {
            return "Pedidos: 3";
        }

        public static void main(String[] args) throws Exception {
            try (var escopo = StructuredTaskScope.open()) {
                var usuario = escopo.fork(ExampleConcurrence::buscarUsuario);
                var pedidos = escopo.fork(ExampleConcurrence::buscarPedidos);

                escopo.join();

                System.out.println(usuario.get());
                System.out.println(pedidos.get());
            }
        }
    }
}
*/

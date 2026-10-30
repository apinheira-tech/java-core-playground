package br.apinheira.fundamentals.types;

public class ServicoPagamento {
            public static void main(String[] args) {
            var valorCompra = 370.0;          // double
            var quantidadeParcelas = 4;       // int
            Integer clientesFidelidade = 2;   // wrapper

            double desconto = valorCompra * 0.10;
            double valorComDesconto = valorCompra - desconto;

            int totalParcelado = (int) (valorComDesconto / quantidadeParcelas);
            double taxaMaquina = valorComDesconto * 0.03;
            double valorFinal = valorComDesconto + taxaMaquina;

            boolean podeParcelar = quantidadeParcelas <= clientesFidelidade * 2
                    && valorFinal >= 200;

            System.out.println(totalParcelado);
            System.out.println(valorFinal);
            System.out.println(podeParcelar);
    }
}

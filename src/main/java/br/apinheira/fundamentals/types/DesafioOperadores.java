package br.apinheira.fundamentals.types;

/**
 * Demonstra operadores aritméticos, relacionais e lógicos, além da conversão
 * entre tipos primitivos e o uso da classe wrapper {@link Integer}.
 */
public class DesafioOperadores {

    /**
     * Calcula e exibe o total de uma compra, a média por unidade e se há
     * disponibilidade no estoque para a quantidade informada.
     *
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        var preco = 10.0;        // double
        var qtd = 3;             // int
        Integer estoque = 5;     // wrapper Integer

        int total = (int) (preco * qtd);
        double media = total / qtd;
        boolean disponivel = qtd < estoque && total >= 30;

        System.out.println(total);
        System.out.println(media);
        System.out.println(disponivel);
    }

}

package br.apinheira.flowcontrol.arrays.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

public class ProcessadorVendas {
    static class MetaNaoAtingidaException extends Exception {
        MetaNaoAtingidaException(String mensagem) {
            super(mensagem);
        }
    }

    public static void main(String[] args) {
        double[][] vendas = {
                {100.0, 250.0},
                {80.0, 120.0}
        };

        try (BufferedReader leitor = new BufferedReader(new StringReader("Relatorio de vendas"))) {
            double totalDia1 = Arrays.stream(vendas[0]).sum();
            double totalDia2 = Arrays.stream(vendas[1]).sum();

            double[] totais = {totalDia1, totalDia2};
            Arrays.sort(totais);

            double totalGeral = totais[0] + totais[1];

            if (totalGeral < 500) {
                throw new MetaNaoAtingidaException("Meta de vendas não atingida");
            }

            System.out.println(Arrays.toString(totais));
            System.out.println("Total geral: " + totalGeral);

        } catch (MetaNaoAtingidaException | IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Processamento finalizado");
        }
    }
}

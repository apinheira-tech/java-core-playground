package br.apinheira.flowcontrol.arrays.exceptions;


import java.util.Arrays;

public class BoletimEscolar {

    public static void main(String[] args) {
        double[][] notas = {
                {8.0, 7.5, 9.0},
                {6.0, 10.0, 8.0}
        };

        double[] medias = new double[notas.length];

        for (int i = 0; i < notas.length; i++) {
            double soma = 0;

            for (double nota : notas[i]) {
                soma += nota;
            }

            medias[i] = soma / notas[i].length;
        }

        Arrays.sort(medias);
        double maiorMedia = medias[medias.length - 1];

        System.out.println(Arrays.toString(medias));
        System.out.println(maiorMedia);
    }
}



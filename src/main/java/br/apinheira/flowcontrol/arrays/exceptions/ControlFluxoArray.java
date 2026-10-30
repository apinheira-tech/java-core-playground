package br.apinheira.flowcontrol.arrays.exceptions;

public class ControlFluxoArray {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 2, 9};
        int resultado = 0;

        for (int n : numeros) {
            if (n % 2 == 0) {
                resultado += n;
            } else {
                resultado -= 1;
            }
        }

        System.out.println(resultado);
    }
}

package br.apinheira.poo.essencial;

public class ExampleObject {

    static class Cliente {
        String nome;
        int idade;
    }

    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[1_000_000];

        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente();
            clientes[i].nome = "Cliente " + i;
            clientes[i].idade = vinte(i);
        }

        System.out.println(clientes[0].nome);
    }

    static int vinte(int valor) {
        return valor % 20;
    }
}

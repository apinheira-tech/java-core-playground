package br.apinheira.generics.collections;

import java.util.ArrayList;
import java.util.Collection;

public class ExampleCollections {
    public static void main(String[] args) {
        Collection<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Ana");
        nomes.remove("Ana");

        System.out.println(nomes.size());
    }
/*
        Collection<String> nomes = new ArrayList<>();
            nomes.add("Ana");
            nomes.add("Bruno");
            nomes.add("Ana");
            System.out.println(nomes.size());
*/

}


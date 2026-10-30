/*
package br.apinheira.vectors;

import jdk.incubator.vector.IntVector;
import jdk.incubator.vector.VectorSpecies;

    public class ExampleVectorAPI {
        static final VectorSpecies<Integer> ESPECIE =
                IntVector.SPECIES_PREFERRED;

        public static void main(String[] args) {
            int[] valores = {1, 2, 3, 4, 5, 6, 7, 8};
            int[] resultado = new int[valores.length];

            int limite = ESPECIE.loopBound(valores.length);

            for (int i = 0; i < limite; i += ESPECIE.length()) {
                var vetor = IntVector.fromArray(ESPECIE, valores, i);
                vetor.mul(2).intoArray(resultado, i);
            }

            for (int i = limite; i < valores.length; i++) {
                resultado[i] = valores[i] * 2;
            }

            for (int valor : resultado) {
                System.out.println(valor);
        }
   }
}
*/

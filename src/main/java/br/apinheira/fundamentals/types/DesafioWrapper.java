package br.apinheira.fundamentals.types;

public class DesafioWrapper {
      public static void main(String[] args) {
            Integer a = 7;
            int b = 2;
            double c = 5.0;

            int x = a * b;                 // 14
            double y = x / b;              // 7.0
            boolean z = a > b && x + 1 >= 15;

            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
      }
}

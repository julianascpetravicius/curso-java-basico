package com.loiane.cursojava.aula16.labs;

public class Exercício4 {

    public static void main(String[] args) {

        long popA = 80000L;
        long popB = 200000L;

        int cont;
        for(cont = 0; popA < popB; ++cont) {
            popA += popA / 100L * 3L;
            popB = (long)((double)popB + (double)(popB / 100L) * 1.5);
        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Qtd anos:    " + cont);

    }
}


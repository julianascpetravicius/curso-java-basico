package com.loiane.cursojava.aula16.labs;

public class Exercício4 {

    public static void main(String[] args) {

        long popA = 80000;
        long popB = 200000;
        int cont = 0;

        while(popA < popB){

            popA += (popA/100)* 3;
            popB +=  (popB/100) * 1.5;
            cont++;
        }

        System.out.println("População A: "+ popA);
        System.out.println("População B: "+ popB);
        System.out.println("Qtd anos:    "+ cont);

    }
}


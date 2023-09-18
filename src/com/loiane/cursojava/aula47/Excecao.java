package com.loiane.cursojava.aula47;

public class Excecao {
    public static void main(String[] args) {

        try {

            int[] vetor = new int[4];

            System.out.println("Antes da Excepcion");

            vetor[4] = 1;

            System.out.println("Esse texto não será imresso");


        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Exceção ao acessar um indice do vetor que não existe ");
        }
        System.out.println("Esse texto será tratado após a exception");
    }
}

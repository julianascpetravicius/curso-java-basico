package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercício15 {

    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o n-ésimo termo da série de Fibonacci:");
        int n = scan.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo = 1;

        for (int i=3; i<=n; i++){

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }


    }
}


package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercício8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;
        int media;
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Entre com um número");
            num = scan.nextInt();

           soma += num;
        }
        media = soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média: "+ media);
    }
}


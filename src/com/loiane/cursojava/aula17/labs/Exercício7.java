package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercício7 {

    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;

        for(int i = 1; i <= 5; ++i) {
            System.out.println("Entre com um número");
            int num = scan.nextInt();
            if (num > maior) {
                maior = num;
                System.out.println("O número maior mudou: " + num);
            }
        }

        System.out.println("O maior número digitado foi: " + maior);

    }
}


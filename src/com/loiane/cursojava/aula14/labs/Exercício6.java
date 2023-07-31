package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

public class Exercício6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número:");
        double num1 = scan.nextDouble();
        System.out.println("Entre com outro número:");
        double num2 = scan.nextDouble();
        System.out.println("Entre com outro número:");
        double num3 = scan.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O primeiro número é maior");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O segundo número é maior");
        } else {
            System.out.println("O terceiro número é maior");
        }

    }
}


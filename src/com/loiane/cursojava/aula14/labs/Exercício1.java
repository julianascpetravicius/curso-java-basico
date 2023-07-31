package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

public class Exercício1 {
//Faça um Programa que peça dois números e imprima o maior deles.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o primeiro número: ");
        double num1 = scan.nextDouble();

        System.out.print("Entre com o segundo número: ");
        double num2 = scan.nextDouble();

        if (num1 > num2){
            System.out.println("O primeiro número é maior que o segundo.");
        } else {
            System.out.println("O segundo número é maior que o primeiro.");
        }


    }
}


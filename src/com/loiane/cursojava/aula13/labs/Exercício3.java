package com.loiane.cursojava.aula13.labs;
//Faça um programa que peça dois números e imprima a soma.

import java.util.Scanner;

public class Exercício3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Digite o primeiro número: , Digite o segundo número: ");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int resultado = num1 + num2;
        System.out.println(resultado);


    }
}


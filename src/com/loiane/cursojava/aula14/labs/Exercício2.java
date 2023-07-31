package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

//Faça um Programa que peça um valor e mostre se o programa é positivo ou negativo
public class Exercício2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número positivo ou negativo.:");
        int numero = scan.nextInt();

        if (numero < 0) {
            System.out.println("negativo");
        } else {
            System.out.println("positivo");
        }

    }
}


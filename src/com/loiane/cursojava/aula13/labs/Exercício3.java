package com.loiane.cursojava.aula13.labs;
//Faça um programa que peça dois números e imprima a soma.

import java.util.Scanner;

public class Exercício3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Digite o primeiro número: , Digite o segundo número: ");
        int primeiroNumero = scan.nextInt();
        int segundoNumero = scan.nextInt();
        int terceiroNumero = primeiroNumero + segundoNumero;
        System.out.println(terceiroNumero);


    }
}


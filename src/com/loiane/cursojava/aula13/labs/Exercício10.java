package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

//Faça um programa que peça a temperatura em graus Celsius. Transforme e mostre em graus Farenheit
public class Exercício10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Celsius:");
        double c = scan.nextDouble();

        double f = c*1.8 + 32;

        System.out.println("A temperatura " + c + " C é igual a " + f + "F");


    }
}


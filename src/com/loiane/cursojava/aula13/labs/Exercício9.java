package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

//Faça um programa que peça a temperatura em graus Farenheit. Transforme e mostre a temperatura em em graus Celsius.
// c = (5*(F-32)/9).
public class Exercício9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Farenheit:");
        double f = scan.nextDouble();

        double c = (5*(f-32)/9);

        System.out.println("A temperatura " + f + " F é igual a " + c + "C");



    }
}


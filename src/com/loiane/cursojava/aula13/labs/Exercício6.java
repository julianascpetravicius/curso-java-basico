package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

//Faça um programa que peça um raio de um círculo, calcule e mostre a sua área.
public class Exercício6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do círculo em centimetros:");
        double raio = scan.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do cículo é de " + area + "cm");


    }
}


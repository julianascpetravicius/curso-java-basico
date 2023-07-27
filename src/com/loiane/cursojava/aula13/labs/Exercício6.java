package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

//Faça um programa que peça um raio de um círculo, calcule e mostre a sua área.
public class Exercício6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do círculo em centimetros:");
        float raio = scan.nextFloat();
        System.out.println("A área do cículo é de " + raio * 2 +"cm");


    }
}


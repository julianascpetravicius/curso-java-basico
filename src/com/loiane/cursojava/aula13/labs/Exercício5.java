package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

//Faça um programa que converta metros em centimetros.
public class Exercício5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de metros: ");

        double metros = scan.nextDouble();
        double centímetros = metros * 100;
        System.out.println("O valor em metros convertidos em centímetros é de: " + centímetros + "cm");

    }
}


package com.loiane.cursojava.aula13.labs;
//Faça um Programa com 4 notas bimestrais e mostre a média.

import java.util.Scanner;

public class Exercício4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scan.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = scan.nextDouble();

        double resultado = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua média é: " + resultado);


    }
}


package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

//Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
public class Exercício7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um lado do quadrado em metros:");
        double lado = scan.nextDouble();

        double area = Math.pow(lado, 2);
        System.out.println("A área do quadrado é: "+ area +"m");
        System.out.println("O dobro da área do quadrado é " + area * 2 +"m" );

    }
}


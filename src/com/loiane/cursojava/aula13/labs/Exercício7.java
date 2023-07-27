package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

//Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
public class Exercício7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base e a altura do quadrado em metros:");
        int base = scan.nextInt();
        int altura = scan.nextInt();
        int resultado = base * altura * 2;
        System.out.println("O dobro da área do quadrado é: "+ resultado +"m");

    }
}


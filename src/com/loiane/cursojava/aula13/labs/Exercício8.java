package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

//Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
//Calcule e mostre o seu salário referido no mês.
public class Exercício8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor que você ganha por hora e o número de horas trabalhadas:");
        int valor = scan.nextInt();
        int hora = scan.nextInt();
        int resultado = valor * hora;
        System.out.println("O valor do seu salário no referido mês é de: "+ resultado +"€");

    }
}


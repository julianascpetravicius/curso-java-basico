package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

//.Faça um programa para uma loja de tintas. O programa deverá pedir o
//tamanho em metros quadrados da área a ser pintada. Considere que a
//cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
//tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
//usuário a quantidades de latas de tinta a serem compradas e o preço
//total.
public class Exercício16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe em metros quadrados da area a ser pintada: ");
        int area = scan.nextInt();
        int litros = area / 3;
        int latas = litros / 18;
        double valor = latas * 80.00;
        System.out.println("Você vai precisar de: " + latas + " latas de tinta");
        System.out.println("O valor total é de R$" + valor);

    }
}


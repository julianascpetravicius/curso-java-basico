package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

//Faça um programa que peça 2 números inteiros e 1 real.
// Calcule e mostre:
// a. o produto do dobro do primeiroa metade do segundo.
// b. a soma do triplo do primeiro com o terceiro.
// c. o terceiro elevado ao cubo.
public class Exercício11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 2 números inteiro e 1 número real");
        int primeiroInteiro = scan.nextInt();
        int segundoInteiro = scan.nextInt();
        double real = scan.nextDouble();
        System.out.println((primeiroInteiro * 2) * (segundoInteiro / 2));
        System.out.println(primeiroInteiro * 3 + real);
        System.out.println(Math.pow(real, 3));


    }
}


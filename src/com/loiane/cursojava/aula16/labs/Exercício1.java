package com.loiane.cursojava.aula16.labs;

import java.util.Scanner;

public class Exercício1 {

    public static void main(String[] args) {

          Scanner scan = new Scanner(System.in);
        boolean notaValida = false;

        do {
            System.out.println("Entre com uma nota");
            double nota = scan.nextDouble();
            if (nota >= 0.0 && nota <= 10.0) {
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            } else {
                System.out.println("Nota inválida, digite novamente.");
            }
        } while(!notaValida);


    }
}


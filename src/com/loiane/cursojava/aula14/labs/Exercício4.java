package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

// Faça um Programa que verifique se uma letra é vogal ou consoante.
public class Exercício4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma letra:");
        String letra = scan.next();

        switch (letra){

            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U": System.out.println("vogal"); break;
            default: System.out.println("consoante"); break;
        }

    }
}


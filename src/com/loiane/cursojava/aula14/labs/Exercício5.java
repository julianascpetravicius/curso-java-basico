package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

/*Faça um Programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
   *  A mensagem aprovado, se a média alcançada for igual ou maior a sete
   *  A mensagem reprovado, se a media for menor que sete;
   *  A mensagem aprovado com distinção, se a média for igual a dez.
 */
public class Exercício5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada notas
        System.out.println("Informe a primeira nota:");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota:");
        double nota2 = scan.nextDouble();
        //Cálculo média
        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7 && media < 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }




    }
}


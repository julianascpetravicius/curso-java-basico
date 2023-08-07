package com.loiane.cursojava.aula20.labs;
//Gere e imprima uma matriz M 10x10 com valores aleatórios entre
//0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
//qual é o maior e o menor valor da coluna 7.

import java.util.Random;

public class Exercício2 {

    public static void main(String[] args) {

        int[][] valoresAleatorios = new int[10][10];

        Random numeroRandom = new Random();

        for (int i = 0; i < valoresAleatorios.length; i++) {
            for (int j = 0; j < valoresAleatorios[i].length; j++) {
                valoresAleatorios[i][j] = numeroRandom.nextInt(100);

            }

        }
        for (int i=0; i<valoresAleatorios.length; i++) {
                 for (int j = 0; j < valoresAleatorios[i].length; j++) {
                     System.out.print(valoresAleatorios[i][j] + " - ");
                 }
                 System.out.println();
             }

            int maiorl5 = 0;
            int menorl5 = 0;
            int linha5 = 5;
            for (int i = 0; i < valoresAleatorios[5].length; i++) {
                for (int j = 0; j < valoresAleatorios[i].length; j++) {
                    if (valoresAleatorios[linha5][j] > maiorl5) {
                        maiorl5 = valoresAleatorios[linha5][j];
                    }
                    if (valoresAleatorios[linha5][j] < menorl5) {
                        menorl5 = valoresAleatorios[i][j];
                    }

                }

            }
            System.out.println("O maior número da linha 5 é: " + maiorl5);
            System.out.println("O menor número da linha 5 é: " + menorl5);

            int maiorC7 = Integer.MIN_VALUE;
            int menorC7 = Integer.MAX_VALUE;
            int col7 = 7;

            for (int i = 0; i < valoresAleatorios.length; i++) {
                for (int j = 0; j < valoresAleatorios[i].length; j++) {
                    if (valoresAleatorios[i][col7] > maiorC7) {
                        maiorC7 = valoresAleatorios[i][j];

                    }
                    if (valoresAleatorios[i][col7] < menorC7) {
                        menorC7 = valoresAleatorios[i][j];
                    }
                }



            }
             System.out.println("O maior numero da coluna 7 é: " + maiorC7);
             System.out.println("o menor número da coluna 7 é: " + menorC7);

        }

    }
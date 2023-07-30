package com.loiane.cursojava.aula14.labs;
//Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritimo que calcule seu peso ideal,
// utilizando as seguintes fórmulas.
// Para homens: (72.7*h)-58
// Para mulheres: (62.1*h)-44.7
// h = altura
// Peça o peso da pessoa e informe se está dentro, acima ou abaixo do peso ideal

import java.util.Scanner;

public class Exercício13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe se você é Homem ou Mulher");
        String input = scan.next();
        System.out.println("Informe sua altura");
        double altura = scan.nextDouble();

        if (input.equalsIgnoreCase("Homem")){
            double pesoIdealHomem = (72.7*altura)-58;
            System.out.println("Informe seu peso");
            double pesoHomem = scan.nextDouble();
            if (pesoHomem > pesoIdealHomem){
                System.out.println("Acima do peso");
            } else if (pesoHomem < pesoIdealHomem){
                System.out.println("Abaixo do peso");
            } else {
                System.out.println("Peso ideal");
            }
        } else if (input.equalsIgnoreCase("Mulher")) {
            double pesoIdealMulher = (62.1*altura)-44.7;
            System.out.println("Informe seu peso:");
            double pesoMulher = scan.nextDouble();
            if (pesoMulher > pesoIdealMulher){
                System.out.println("Acima do peso");
            } else if (pesoMulher < pesoIdealMulher){
                System.out.println("Abaixo do peso");
            } else {
                System.out.println("Peso ideal");
            }
        }

    }
}


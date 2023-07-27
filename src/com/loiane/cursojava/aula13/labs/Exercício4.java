package com.loiane.cursojava.aula13.labs;
//Faça um Programa com 4 notas bimestrais e mostre a média.

public class Exercício4 {

    public static void main(String[] args) {

        double primeiroBimestre = 7.0;
        double segundoBimestre = 10.0;
        double terceiroBimestre = 9.0;
        double quartoBimestre = 8.0;
        double resultado = primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre;
        resultado = resultado / 4;
        System.out.println("Sua média é: " + resultado);


    }
}


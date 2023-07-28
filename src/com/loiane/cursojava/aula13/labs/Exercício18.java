package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

//Faça um programa que peça o tamanho de um arquivo para download
//(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
//informe o tempo aproximado de download do arquivo usando este link
//(em minutos)
public class Exercício18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo para download (em MB) e a velocidade de um link de internet (em Mbps): ");
        double mb = scan.nextDouble();
        double mbps = scan.nextDouble();
        double velocidade = mb / mbps;
        double minutos = velocidade / 60;
        System.out.println("A velocidade de download é de "+ minutos + "minutos");


    }
}


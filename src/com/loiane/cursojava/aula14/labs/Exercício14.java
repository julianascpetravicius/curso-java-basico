package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

//14.João Papo-de-Pescador, homem de bem, comprou um
//microcomputador para controlar o rendimento diário de seu trabalho.
//Toda vez que ele traz um peso de peixes maior que o estabelecido
//pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
//pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
//você faça um programa que leia a variável peso (peso de peixes) e
//verifique se há excesso. Se houver, gravar na variável excesso e na
//variável multa o valor da multa que João deverá pagar. Caso contrário
//mostrar tais variáveis com o conteúdo ZERO
public class Exercício14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o peso do peixe:");
        double pesoDePeixes = scan.nextDouble();

        if (pesoDePeixes > 50.00){
            double excesso = pesoDePeixes - 50;
            double multa = excesso * 4.00;
            System.out.println("O valor da multa a pagar é de: R$"+ multa);

        } else {
            System.out.println("Zero");
        }

    }
}


package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;
import java.lang.Math;

//Faça um Programa para uma loja de tintas. O programa deverá pedir o
//tamanho em metros quadrados da área a ser pintada. Considere que a
//cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a
//tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em
//galões de 3,6 litros, que custam R$ 25,00.
//o Informe ao usuário as quantidades de tinta a serem compradas
//e os respectivos preços em 3 situações:
//o comprar apenas latas de 18 litros;
//o comprar apenas galões de 3,6 litros;
//o misturar latas e galões, de forma que o preço seja o
//menor. Acrescente 10% de folga e sempre arredonde os
//valores para cima, isto é, considere latas cheias.
public class Exercício17 {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            //Informações sobre a are a ser pintada
            System.out.print("Informe a área a ser pintada: ");
            double area = scan.nextDouble();

            //Calculo litros de tinta
            double litrosComFolga =  area / 6 * 1.1;

            //Calculo latas de tinta
            double latas18l = (int)Math.ceil(litrosComFolga / 18); //latas de tinta arrendondada para maior
            double latas36l = (int)Math.ceil(litrosComFolga / 3.6); //latas de tinta arredondada para maior

            //Calculo mistura
            double latasMenor = (int)Math.floor(litrosComFolga / 18); // latas de tinta com o valor arredondado para baixo
            double sobra = litrosComFolga % 18;
            double galao = (int)Math.ceil(sobra / 3.6);

            //Latas + galões
            double mistura = latasMenor + galao;

            //Calculo preços
            double preço18l = latas18l * 80.0;
            double preço36l = latas36l * 25.0;
            double preçolasMenor = latasMenor * 80.0;
            double preçoGalao = galao * 25.0;
            double preçomistura = preçolasMenor + preçoGalao;

            System.out.println("Quantidade de latas:");
            System.out.println("Comprar apenas latas de 18l " + latas18l + " latas");
            System.out.println("Comprar apenas latas de 3,6l " + latas36l + " latas");
            System.out.println("Comprar "+ latasMenor + " latas de 18l e " + galao + " latas de 3,6l");

            System.out.println("Preço Latas");
            System.out.println("Apenas latas de 18l R$" + preço18l);
            System.out.println("Apenas latas de 3,6l R$" + preço36l);
            System.out.println("Mistura de latas de 18l e 3,6l R$" + preçomistura);



    }
}


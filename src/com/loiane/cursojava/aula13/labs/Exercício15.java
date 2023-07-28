package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

//15.Faça um Programa que pergunte quanto você ganha por hora e o
//número de horas trabalhadas no mês. Calcule e mostre o total do seu
//salário no referido mês, sabendo-se que são descontados 11% para o
//Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
//programa que nos dê:
//. salário bruto.
//a. quanto pagou ao INSS.
//b. quanto pagou ao sindicato.
//c. o salário líquido.
//d. calcule os descontos e o salário líquido, conforme a tabela
//abaixo:
//+ Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato (5%) : R$ = Salário Líquido : R$
// Obs.: Salário Bruto - Descontos = Salário Líquido.
public class Exercício15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o seu salário bruto: ");
        double salarioBruto = scan.nextDouble();
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double ir = salarioBruto * 0.11;
        double descontos = inss + sindicato + ir;
        double salárioLiquido = salarioBruto - descontos;
        System.out.println("Salário bruto: R$" + salarioBruto);
        System.out.println("INSS: R$" + inss);
        System.out.println("Sindicato: R$" + sindicato);
        System.out.println("IR: R$" + ir);
        System.out.println("Salário Líquido: R$" + salárioLiquido);
    }
}


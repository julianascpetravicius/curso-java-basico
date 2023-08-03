package com.loiane.cursojava.aula16.labs;

import java.util.Scanner;

public class Exercício3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome, genero, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.println("Entre com um nome");

            nome = scan.next();

            if (nome.length() > 3) {
                infoValida = true;
            } else {
                System.out.println("Nome precisa de no mínimo 3 caracteres.");
            }
        }while (!infoValida);

         do {
            System.out.println("Entre a idade");

            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150) {
                infoValida = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150.");
            }
        }while (!infoValida);
         do {
            System.out.println("Entre o salário");

            salario = scan.nextDouble();

            if (salario > 0) {
                infoValida = true;
            } else {
                System.out.println("Salário precisa ser maior que 0.");
            }
        }while (!infoValida);

         do {
            System.out.println("Entre o gênero");

            genero = scan.next();

            if (genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("m")) {
                infoValida = true;
            } else {
                System.out.println("Genero precisa ser f ou m.");
            }
        }while (!infoValida);

          do {
            System.out.println("Entre o Estado Civil");

            estadoCivil = scan.next();

            if (genero.equalsIgnoreCase("s") || genero.equalsIgnoreCase("c")
                    || genero.equalsIgnoreCase("d") || genero.equalsIgnoreCase("v")) {
                infoValida = true;
            } else {
                System.out.println("Genero precisa ser 's', 'c', 'd' ou 'v'.");
            }
        }while (!infoValida);

        System.out.println("As seguintes informaçõe foram coletadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: "+ idade);
        System.out.println("salário: "+ salario);
        System.out.println("genero: "+ genero);
        System.out.println("Estado Civil: "+ estadoCivil);


    }
}


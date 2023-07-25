package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("seu nome completo é: "+ nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: "+ primeiroNome);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua Idade é: "+ idade);*/

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem pet:");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        double altura = scan.nextDouble();
        boolean temPet = scan.nextBoolean();

        System.out.println("Você digitou os seguintes valores");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("altura: " + altura);
        System.out.println("Tem Pet: " + temPet);




    }
}


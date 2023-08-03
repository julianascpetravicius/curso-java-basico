package com.loiane.cursojava.aula16.labs;
/*Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.*/

import java.util.Scanner;

public class Exercício2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;

        do {
            System.out.println("Entre com o usuário: ");
            String user = scan.next();

             System.out.println("Entre com a senha: ");
             String senha = scan.next();


            if (user.equalsIgnoreCase(senha)) {
                //infoValida = false;
                System.out.println("Senha igual ao usuário, digite novamente.");
            } else {
                infoValida = true;
                System.out.println("Senha e ususários válidos");
            }
        } while (!infoValida);

    }
}


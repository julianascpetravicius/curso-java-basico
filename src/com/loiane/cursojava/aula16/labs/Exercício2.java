package com.loiane.cursojava.aula16.labs;

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
                System.out.println("Senha igual ao usuário, digite novamente.");
            } else {
                infoValida = true;
                System.out.println("Senha e ususários válidos");
            }
        } while(!infoValida);


    }
}


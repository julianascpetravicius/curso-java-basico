package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exercício5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][][] comprisso = new String[12][31][8];

        boolean sair = false;
        byte opcao;
        while (!sair) {

            System.out.println("Digite 1 para adicionar compromisso");
            System.out.println("Digite 2 para verificar compromisso");
            System.out.println("Digite 0  para sair");

            opcao = scan.nextByte();

            if (opcao == 1) {//adicionar compromisso

                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Entre com o mês");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente");

                    }

                }

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");

                    }

                }
                boolean horaValido = false;
                int hora = 0;
                while (!horaValido) {
                    System.out.println("Entre com a hora compromisso");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 8) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");

                    }

                }
                mes--;
                dia--;
                System.out.println("Digite o compromisso");
                comprisso[mes][dia][hora] = scan.next();


            } else if (opcao == 2) { //verificar compromisso

                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Entre com o mês");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente");

                    }

                }

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");

                    }

                }
                boolean horaValido = false;
                int hora = 0;
                while (!horaValido) {
                    System.out.println("Entre com a hora compromisso");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 8) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");

                    }

                }
                mes--;
                dia--;
                System.out.println("O compromisso agendado é:");
                System.out.println(comprisso[mes][dia][hora]);

            } else if (opcao == 0) {
                sair = true;

            } else {
                System.out.println("Opção inválida, digite novamente");
            }

        }

    }
}


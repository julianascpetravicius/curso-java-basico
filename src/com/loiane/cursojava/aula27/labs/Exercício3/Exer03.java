package com.loiane.cursojava.aula27.labs.Exercício3;

public class Exer03 {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.nome = "Juliana";
        aluno.matricula = 123456;
        aluno.curso = "Engenharia de Software";
        aluno.arquiteturaDeSoftware = 10;
        aluno.cyberseguranca = 9;
        aluno.linguagemPython = 5;
        aluno.aprovado = true;

        boolean aprovado = aluno.mostrarEstadoPython();

        if (aprovado) {
            System.out.println("Aprovado");
        } else {
            System.out.println("reprovado");
        }

        boolean aprovadoC = aluno.mostrarEstadoCyberseguranca();

        if (aprovadoC) {
            System.out.println("Aprovado");
        } else {
            System.out.println("reprovado");
        }

        boolean aprovadoA = aluno.mostrarEstadoArquitetura();

        if (aprovadoA) {
            System.out.println("Aprovado");
        } else {
            System.out.println("reprovado");


        }
    }
}


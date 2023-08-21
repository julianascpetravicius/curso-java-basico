package com.loiane.cursojava.aula27.labs.Exercício3;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

         Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno");
        aluno.nome = scan.next();

        System.out.println("Entre com o nome do curso ");
        aluno.curso = scan.next();

        System.out.println("Entre com o nome a matrícula ");
        aluno.matricula = scan.nextInt();

        //aluno.disciplinas = new String[3];
        for (int i=0; i<aluno.disciplinas.length; i++){
            System.out.println("Entre com o nome da disciplina "+ i);
            aluno.disciplinas[i] = scan.next();
        }
        for (int i=0; i<aluno.notasDisciplinas.length; i++){
            System.out.println("Obtendo notas da disciplina " + aluno.disciplinas[i]);
            for (int j=0; j<aluno.notasDisciplinas[i].length; j++){
                System.out.println("Entre com a nota " + (j+i));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }

          aluno.mostrarInfo();

        for (int i=0; i<aluno.notasDisciplinas.length; i++){
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina " + aluno.disciplinas[i] + " -- foi aprovado");
            }else {
                System.out.println("Disciplina " + aluno.disciplinas[i] + " -- foi reprovado");
            }
        }


        }


}


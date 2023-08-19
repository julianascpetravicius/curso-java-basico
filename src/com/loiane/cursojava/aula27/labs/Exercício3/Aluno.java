package com.loiane.cursojava.aula27.labs.Exercício3;
//Escreva	uma	class	para	representar	um	Aluno.	Adicione	atributos
//relacionados	às	caracteristicas	de	um	Aluno,	como	nome,	matricula,	curso
//que	está	matriculado,	nome	de	3	disciplinas	que	está	cursando e	as	notas
//dessas 3 disciplinas. Desenvolva	um	método	para	verificar	se	o	aluno	está
//aprovado	(nota	maior	ou	igual	a	7)	em	uma determinada	disciplina.
//Escreva	um	programa	para	testar	essa	classe,	que	pede	as	informações	do
//aluno	ao	usuário	e	ao	final	informa	o	nome	das	disciplinas,	mostra as
//notas e	mostra	se	o	aluno	foi	aprovado	ou	não

public class Aluno {

   String nome;
   int matricula;
   String curso;
   int arquiteturaDeSoftware;
   int cyberseguranca;
   int linguagemPython;
   boolean aprovado;

   boolean mostrarEstadoArquitetura(){
      if(arquiteturaDeSoftware>7){
          aprovado = true;
          return true;
      } else {
         aprovado = false;
         return false;
      }



   }
   boolean mostrarEstadoCyberseguranca(){
      if (cyberseguranca>7) {
         aprovado = true;
         return true;
      }else {
         aprovado = false;
         return false;
      }


   }
    boolean mostrarEstadoPython() {

       if (linguagemPython > 7) {
          aprovado = true;
          return true;
       } else {
          aprovado = false;
          return false;
       }

    }









}


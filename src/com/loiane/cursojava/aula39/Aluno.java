package com.loiane.cursojava.aula39;

public class Aluno extends Pessoa {


    private String curso;
    private double[] notas;

    public void verificarAcesso(){
       this.nomeVisibilidade = "nome";
    }

    public Aluno(String nome, String endereco, String telefone, String cpf, String telefoneCelular, String curso) {
        super(nome, endereco, telefone, cpf, telefoneCelular);
        this.curso = curso;
    }

    public Aluno() {
        super();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }
    public boolean verificarAprovado(){
        return true;
    }

    public void metodoQualquer(){
        super.setCpf("3456789");
        this.setCpf("34567890");
    }
}

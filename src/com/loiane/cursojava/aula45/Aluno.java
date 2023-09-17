package com.loiane.cursojava.aula45;

public  class Aluno extends Pessoa {


    private String curso;
    private double[] notas;

    public Aluno(String nome, String endereco, String telefone, String cpf, String telefoneCelular, String curso) {
       // super(nome, endereco, telefone, cpf, telefoneCelular);
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
        //super.setCpf("3456789");
       // this.setCpf("34567890");
    }

    public String obterEtiquetaEndereco(){

        String s= "Endereço do Aluno: ";
        //s += super.getEndereco();

        return s;
    }
    public void imprimirEtiquetaEndereco() {

        System.out.println("Imprimindo endereço do Aluno: ");
        System.out.println(this.obterEtiquetaEndereco());


    }
}


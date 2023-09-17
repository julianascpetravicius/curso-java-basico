package com.loiane.cursojava.aula45;

public class Professor extends Pessoa {


    private double salario;
    private String nomeCurso;

    //public Professor(String nome, String endereco, String telefone, String cpf, String telefoneCelular) {
       // super(nome, endereco, telefone, cpf, telefoneCelular);
    //}

    public Professor() {
        super();
    }

    public Professor(String nome, String endereco, String telefone, String cpf, String telefoneCelular, String nomeCurso) {
        //super(nome, endereco, telefone, cpf, telefoneCelular);
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public double calcularSalarioLiquido(){
        return 0;
    }

    public String obterEtiquetaEndereco(){

        String s= "Endereço do Professor: ";
        //s += super.getEndereco();

        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {

        System.out.println("Imprimindo endereço Professor: ");
        System.out.println(this.obterEtiquetaEndereco());


    }

}

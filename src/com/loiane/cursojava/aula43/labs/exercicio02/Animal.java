package com.loiane.cursojava.aula43.labs.exercicio02;

public class Animal {

    private String nome;
    private double comprimento;
    private int numPatas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal() {
    }

    public Animal(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumPatas(int i) {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getCor(String cinzento) {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente(String terra) {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", comprimento=" + comprimento +
                ", numPatas=" + numPatas +
                ", cor='" + cor + '\'' +
                ", ambiente='" + ambiente + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    public void imprimirAnimais(){


        System.out.println("nome: " + nome);
        System.out.println("comprimento: " + comprimento);
        System.out.println("Numero de Patas: " + numPatas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade: " + velocidade + " m/s ");



    }
}

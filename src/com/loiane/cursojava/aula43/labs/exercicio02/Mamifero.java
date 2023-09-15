package com.loiane.cursojava.aula43.labs.exercicio02;

public class Mamifero extends Animal {

    private String alimento;

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Mamifero() {
    }

    public Mamifero(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidade);
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "alimento='" + alimento + '\'' +
                "} " + super.toString();
    }
    public void imprimirAnimais(){

        System.out.println("nome: " + getNome());
        System.out.println("comprimento: " + getComprimento());
        System.out.println("Numero de Patas: " + getNumPatas(0));
        System.out.println("Cor: " + getCor("cinzento"));
        System.out.println("Ambiente: " + getAmbiente("terra"));
        System.out.println("Velocidade: " + getVelocidade() + " m/s ");
        System.out.println("Alimento: " + getAlimento());

    }


}

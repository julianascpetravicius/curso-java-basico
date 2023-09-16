package com.loiane.cursojava.aula43.labs.exercicio03;

public class Peixe extends Animal {

    private String Caracteristicas;

    public String getCaracteristicas(String barbatanaECauda) {
        return Caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        Caracteristicas = caracteristicas;
    }

    public Peixe() {
    }

    public Peixe(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidade);
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "Caracteristicas='" + Caracteristicas + '\'' +
                "} " + super.toString();
    }
    public void imprimirAnimais(){


        System.out.println("nome: " + getNome());
        System.out.println("comprimento: " + getComprimento());
        System.out.println("Numero de Patas: " + getNumPatas(0));
        System.out.println("Cor: " + getCor("cinzento"));
        System.out.println("Ambiente: " + getAmbiente("terra"));
        System.out.println("Velocidade: " + getVelocidade() + " m/s ");
        System.out.println("Características: " + getCaracteristicas("Barbatana e Cauda"));

    }


}

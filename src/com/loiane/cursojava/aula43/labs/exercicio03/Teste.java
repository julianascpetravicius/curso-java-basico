package com.loiane.cursojava.aula43.labs.exercicio03;

public class Teste {
    public static void main(String[] args) {

        System.out.println("*** Animais do Zoo ****");

        Animal animal = new Animal();
        animal.setNumPatas(4);


        Peixe peixe = new Peixe();
        peixe.setNome("Peixe");
        peixe.setNumPatas(0);
        peixe.setAmbiente("mar");
        peixe.setCor("cinzenta");
        peixe.setCaracteristicas("barbatana e cauda");

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarao");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);
        tubarao.setAmbiente("mar");
        tubarao.setCor("Cinzento");
        tubarao.setCaracteristicas("barbatana e cauda");

        tubarao.imprimirAnimais();
        System.out.println("-----------------");

        Mamifero mamifero =new Mamifero();
        mamifero.setAmbiente("terra");

        Mamifero camelo = new Mamifero();
        camelo.setNome("camelo");
        camelo.setComprimento(150);
        camelo.setCor("amarelo");
        camelo.setVelocidade(2.0);
        camelo.setAmbiente("terra");
        camelo.setNumPatas(4);

        camelo.imprimirAnimais();
        System.out.println("-----------------");

        Urso urso = new Urso();
        urso.setCor("castanho");
        urso.setAlimento("mel");


        Urso ursoDoCanada =new Urso();
        ursoDoCanada.setNome("Urso do Canadá");
        ursoDoCanada.setComprimento(180);
        ursoDoCanada.setCor("vermelho");
        ursoDoCanada.setVelocidade(0.5);
        ursoDoCanada.setNumPatas(4);
        ursoDoCanada.setAmbiente("terra");
        ursoDoCanada.setAlimento("mel");


        ursoDoCanada.imprimirAnimais();
        System.out.println("-----------------");


    }
}

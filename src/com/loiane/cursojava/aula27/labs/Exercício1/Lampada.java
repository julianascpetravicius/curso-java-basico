package com.loiane.cursojava.aula27.labs.Exercício1;

//Escreva uma classe para representar uma lâmpada. Desenvolva métodos
//para ligar, desligar a lampada.
public class Lampada {

    String marca;
    String modelo;
    String potencia;
    int cores;
    String[] tipo;
    boolean tipoAbajur;
    boolean ligada;

    void ligar(){
        ligada=true;
    }
    void desligar (){
        ligada=false;
    }

    void mostrarEstado(){
         if (ligada){
            System.out.println("Lâmpada está ligada");

        }else {
            System.out.println("Lâmpada está desligada");
        }
    }

}


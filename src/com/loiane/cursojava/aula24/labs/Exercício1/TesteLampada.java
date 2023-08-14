package com.loiane.cursojava.aula24.labs.Exercício1;

import com.loiane.cursojava.aula24.labs.Exercício1.Lampada;

public class TesteLampada {

    public static void main(String[] args) {

        Lampada led = new Lampada();
        led.marca="Amazon";
        led.modelo="Alexa";
        led.potencia="Bivolt";
        led.cores=3;
        led.tipoAbajur = true;

        led.tipo = new String[5];
        led.tipo[0] = "Abajur";
        led.tipo[1] = "Lampioes";

        System.out.println(led.marca);
        System.out.println(led.modelo);


    }
}


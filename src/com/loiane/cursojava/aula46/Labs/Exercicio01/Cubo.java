package com.loiane.cursojava.aula46.Labs.Exercicio01;

public class Cubo extends Figura3D  implements DimensaoSuperficial, DimensaoVolumetrica{

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "lado=" + lado +
                "} " + super.toString();
    }

    @Override
    public double calcularArea() {

        return 6 * (lado*lado);
    }

    @Override
    public double calcularVolume() {
        return lado * lado * lado;
        //return Math.pow(lado, 3);
    }
}

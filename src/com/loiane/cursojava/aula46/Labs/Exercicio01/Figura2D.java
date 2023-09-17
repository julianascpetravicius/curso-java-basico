package com.loiane.cursojava.aula46.Labs.Exercicio01;

public abstract class Figura2D extends FiguraGeometrica {
    public Figura2D() {
    }

    public Figura2D(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public String toString() {
        return "Figura2D{} " + super.toString();
    }


    public double calcularArea() {
        return 0;
    }
}

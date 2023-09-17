package com.loiane.cursojava.aula46.Labs.Exercicio01;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoSuperficial, DimensaoVolumetrica {
    public Figura3D() {
    }

    public Figura3D(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public String toString() {
        return "Figura3D{} " + super.toString();
    }


}

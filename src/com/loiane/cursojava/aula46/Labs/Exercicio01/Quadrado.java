package com.loiane.cursojava.aula46.Labs.Exercicio01;

public class Quadrado extends Figura2D  implements DimensaoSuperficial{

    private double lado;
    private double area;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                ", area=" + area +
                "} " + super.toString();
    }

    @Override
    public double calcularArea() {
       area = lado * lado;
       System.out.println("A area do quadrado é: "+ area);
        return 0;
    }
}

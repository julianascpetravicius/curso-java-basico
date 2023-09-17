package com.loiane.cursojava.aula46.Labs.Exercicio01;

public class Circulo extends Figura2D implements DimensaoSuperficial{

    private double raio;
    private double area;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", area=" + area +
                "} " + super.toString();
    }

    @Override
    public double calcularArea() {
        area = Math.PI * raio * raio;
        System.out.println("A área do círculo é: " + area);
        return 0;
    }

}

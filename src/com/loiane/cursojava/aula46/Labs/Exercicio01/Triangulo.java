package com.loiane.cursojava.aula46.Labs.Exercicio01;

public class Triangulo extends Figura2D  implements DimensaoSuperficial{

    private double base;
    private double altura;
    private double area;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {

        area = (base * altura)/2;

        System.out.println("A área do triângulo é: "+ area);

        return 0;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                "} " + super.toString();
    }
}

package com.loiane.cursojava.aula43.labs.exercicio02;

public class PessoaJuridica extends Contribuinte {

    private String cnpj;

    public String getCnpj(String tipoPessoa) {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return  this.getRendaBruta() * 0.1;

    }


    @Override
    public void imprimirImposto() {
        System.out.println(calcularImposto());

    }

    @Override
    public String toString() {
        String s = "Pessoa Jurídica[";
        s += super.toString();
        s += " ;cnpj: " + cnpj;
        s += " ;imposto a ser pago: " + calcularImposto();
        s += "]";
        return s;

    }
}

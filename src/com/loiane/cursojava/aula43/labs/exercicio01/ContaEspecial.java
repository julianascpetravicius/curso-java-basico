package com.loiane.cursojava.aula43.labs.exercicio01;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                ", numConta='" + numConta + '\'' +
                ", saldo=" + saldo +
                "} " + super.toString();
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
    }

    public ContaEspecial() {
    }
    public boolean sacar(double valor) {
        double saldoComLimite = this.getSaldo() + limite;

        if ((saldoComLimite - valor) > +0) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }
}

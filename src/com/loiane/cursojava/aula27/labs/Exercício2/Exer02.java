package com.loiane.cursojava.aula27.labs.Exercício2;

public class Exer02 {

    public static void main(String[] args) {

        ContaCorrente ContaCorrente = new ContaCorrente();

        ContaCorrente.titular = "Juliana";
        ContaCorrente.statusEspecial=true;
        ContaCorrente.numero = 123456;
        ContaCorrente.saldo=-10.00;
        ContaCorrente.limiteEspecial=500.00;
        ContaCorrente.valorEspecialUsado = 0;

        ContaCorrente.exibirSaldo();

        boolean saqueEfetuado = ContaCorrente.realizarSaque(400.00);

        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo atual da conta = " + ContaCorrente.saldo);
        }else{
             System.out.println("Não foi possivel realizar saque. Saldo insuficiente");
        }
         System.out.println("Depositar 500 reais");
        ContaCorrente.depositar(500.00);
         System.out.println("Saldo atual da conta = " + ContaCorrente.saldo);

    }
}


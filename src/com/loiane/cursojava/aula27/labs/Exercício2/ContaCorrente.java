package com.loiane.cursojava.aula27.labs.Exercício2;
//Cria	uma	classe	para	representar	uma	conta	corrente	que	possui	um
//número,	um	saldo,	um	status	que	informa	se	ela	é	especial	ou	não,	um
//limite. Desenvolva	métodos	para	realizar	saque	(verificando	se	o	cliente
//pode	realizar	saques),	despositar	dinheiro,	consultar	saldo	e	verificar	se	o
//cliente	está	usando	cheque	especial	ou	não.	Desenvolva	um	programa
//para	testar	essa	classe.

public class ContaCorrente {
    String titular;
    boolean statusEspecial;
    int numero;
    double saldo;
    double limiteEspecial;
    double valorEspecialUsado;




   void exibirSaldo(){

       System.out.println("O seu saldo é "+ saldo);
   }



   boolean realizarSaque(double saque){

       //tem saldo na conta
        if (saldo >= saque){
            saldo -= saque;

            return true;

        } else {// naão tem saldo na conta
            if (statusEspecial){
                //verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= saque){
                    saldo -= saque;
                    return true;
                } else {
                    return false;
                }
            }else {
                return false; //não é especial e não tem saldo
            }
        }


   }
   void depositar(double valorDepositado){

       saldo += valorDepositado;
   }

}


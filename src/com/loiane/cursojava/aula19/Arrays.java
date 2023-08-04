package com.loiane.cursojava.aula19;
<<<<<<< HEAD
/*Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2*/
=======

>>>>>>> origin/master
public class Arrays {

    public static void main(String[] args) {

        double[] temperatura = new double[365];
        temperatura[0] = 31.3;
        temperatura[1] = 32;
        temperatura[2] = 33.7;
        temperatura[3] = 34;
        temperatura[4] = 33.1;

        System.out.println("O valor da temperatura do dia 1 é: "+ temperatura[0]);

        System.out.println("O tamanho do array: "+ temperatura.length);

<<<<<<< HEAD
        System.out.println("Valores do array: "+ temperatura); //posição de memória
=======
        System.out.println("Valores do array: "+ temperatura);
>>>>>>> origin/master

        for (int i=0; i< temperatura.length; i++){
            System.out.println("O valor da temperatura do dia " + (i+1) + " é: "+ temperatura[i]);
        }
        for (double temp: temperatura){
            System.out.println(temp);

        }

    }
}


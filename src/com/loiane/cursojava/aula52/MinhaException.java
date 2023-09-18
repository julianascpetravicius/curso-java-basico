package com.loiane.cursojava.aula52;

public class MinhaException {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denom = {2, 0, 4, 8, 0, 2, 4};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 !=0){
                    //lançar a exception aqui
                    throw new DivisaoNaoExata(numeros[i], denom[i]);
                }
                System.out.println(numeros[i] + "/" + denom[i] + " - " + (numeros[i]) / denom[i]);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata  e) {
                System.out.println("Aconteceu um erro");

            } catch (Exception e) {
                System.out.println("Aconteceu um erro");
                System.out.println(e.getMessage());
            }


        }
    }
}

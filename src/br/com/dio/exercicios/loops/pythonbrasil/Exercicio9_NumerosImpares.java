package br.com.dio.exercicios.loops.pythonbrasil;
//Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
public class Exercicio9_NumerosImpares {
    public static void main(String[] args) {
        int numero = 0;

        while(numero <= 49){
            numero++;
            if ((numero % 2) != 0){
                System.out.print(numero + " ");
            }
        }

    }
}

package br.com.dio.exercicios.loops.pythonbrasil;
/*Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3%
e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
Faça um programa que calcule e escreva o número de anos necessários para que a população do país A
ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.*/
public class Exercicio4_CrescimentoPolulacao {
    public static void main(String[] args) {
        //país A: habitantes = 8000 ; Crescimento Anual: 3%
        //país B: habitantes = 200000 ; Crescimento Anual: 1.5%
        //Programa: Calcular o nº de anos necessários para A >= B em população.

        double paisA = 80000;
        double paisB = 200000;

        int count = 0;

        while (paisA <= paisB){
            paisA = paisA + (paisA * 0.03);
            paisB = paisB + (paisB * 0.015);
            count++;
        }

        System.out.println("Serão necessários " + count + " anos para que a população do país A ultrapasse ou iguale a população do país B. ");

    }
}

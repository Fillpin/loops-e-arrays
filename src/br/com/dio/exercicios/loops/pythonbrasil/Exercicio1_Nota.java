package br.com.dio.exercicios.loops.pythonbrasil;

import java.util.Scanner;
/*1. Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.*/
public class Exercicio1_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Nota:");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota com valor inválido! Digite novamente:");
            nota = scan.nextInt();
        }


    }
}

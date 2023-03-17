package br.com.dio.exercicios.loops.pythonbrasil;

import java.util.Scanner;

//Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles
public class Exercicio10_NumerosInteiros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int intervalo;

        System.out.println("Digite o primeiro número inteiro: ");
        num1 = scan.nextInt();


        System.out.println("Digite o segundo número inteiro: ");
        num2 = scan.nextInt();

        int count = num1 + 1;

        while (count < num2) {
            System.out.print(count + " ");
            count++;
        }


    }
}

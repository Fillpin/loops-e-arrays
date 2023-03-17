package br.com.dio.exercicios.loops.pythonbrasil;

import java.util.Scanner;
//Faça um programa que leia 5 números e informe a soma e a média dos números.
public class Exercicio8_MediaMaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        int count = 1;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            soma = numero + soma;
            count++;
        }while (count <=5);

        System.out.println("A soma total é: " + soma + ", a média total é: " + soma/5);
    }
}

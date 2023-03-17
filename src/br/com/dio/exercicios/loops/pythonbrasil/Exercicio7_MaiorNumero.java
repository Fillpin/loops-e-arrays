package br.com.dio.exercicios.loops.pythonbrasil;

import java.util.Scanner;

/*Faça um programa que leia 5 números e informe o maior número.*/
public class Exercicio7_MaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 0;
        int maiornumero = 0;
        int count = 1;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero > maiornumero) {
                maiornumero = numero;
            }
            count++;
        }while(count <= 5);

        System.out.print("O maior número é: " + maiornumero);


    }
}

package br.com.dio.exercicios.loops.pythonbrasil;

import java.util.Scanner;

//Faça um programa que peça dois números, base e expoente,
// calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.
public class Exercicio13_Potenciacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int base;
        int expoente;
        int resultado = 1;
        int multi;
        int count = 1;

        System.out.println("Digite o primeiro número:");
        base = scan.nextInt();

        System.out.println("Digite o segundo número:");
        expoente = scan.nextInt();

        //Antes de iniciar o código, é necessário adicionar as propriedades da potenciação:
        if(expoente == 0){
            System.out.println("O resultado é : 1"); /*Qualquer número elevado a 0 é 1*/
        } else if (expoente == 1) {
            System.out.println("O resultado é : " + base); /*Qualquer número elevado a 1 é ele mesmo */
        } else if (base == 0) {
            System.out.println("O resultado é : 0"); /* Zero elevado a qualquer número é Zero*/
        } else {
            do {
                multi = base;
                resultado = resultado * multi;
                count++;
            } while (count <= expoente);
            System.out.println("O resultado é : " + resultado);
        }
    }
}

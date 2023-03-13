package br.com.dio.exercicios.loops.pythonbrasil;

import java.util.Scanner;

/*Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
Valide a entrada e permita repetir a operação.*/
public class Exercicio5_CrescimentoPopulacaoAprimorado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pais1;
        double pais2;
        double txCrescimentoA;
        double txCrescimentoB;

        int anos = 0;


        do {
            System.out.print("População do 1º país (menor): ");
            pais1 = scan.nextInt();
            System.out.print("População do 2º país (maior): ");
            pais2 = scan.nextInt();
            if (pais1 == pais2){
                System.out.println("Erro: A quantidade da população dos países são iguais! Informe novamente.");
            }
        } while (pais1 == pais2);

        System.out.print("Taxa de crescimento ao ano do 1º país: ");
        txCrescimentoA = scan.nextDouble();
        System.out.print("Taxa de crescimento ao ano do 2º país: ");
        txCrescimentoB = scan.nextDouble();

        while (pais1 <= pais2){
            pais1 = pais1 + (pais1 * txCrescimentoA);
            pais2 = pais2 + (pais2 * txCrescimentoB);
            anos++;
        }

        System.out.println("Serão necessários " + anos + " ano(s) para a população do primeiro país passar ou igualar à população do segundo.");

    }
}

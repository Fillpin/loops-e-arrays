package br.com.dio.exercicios.loops.pythonbrasil;
import java.util.Scanner;
//Altere o programa anterior para mostrar no final a soma dos números.
public class Exercicio11_NumerosInteirosSoma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int count;
        int soma = 0;
        int novasoma = 0;

        System.out.println("Digite o primeiro número inteiro: ");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        num2 = scan.nextInt();

        count = num1 + 1;
        do {
            System.out.print(count + " ");
            soma = novasoma;
            novasoma = soma + count;
            count++;
        }while (count < num2);
        System.out.println("\nA soma dos números do intervalo é: " + novasoma);
    }
}

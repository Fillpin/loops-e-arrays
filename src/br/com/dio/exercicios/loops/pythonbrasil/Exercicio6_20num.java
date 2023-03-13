package br.com.dio.exercicios.loops.pythonbrasil;
/*Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
 Depois modifique o programa para que ele mostre os números um ao lado do outro.*/
public class Exercicio6_20num {
    public static void main(String[] args) {

        int i;
        for (i = 1;i <= 20; System.out.println(i++)){} //um abaixo do outro

        for (i = 1;i <= 20; System.out.print(i++ + " ")){} // um ao lado do outro

    }
}

package br.com.dio.exercicios.loops.pythonbrasil;

import java.util.Scanner;
/*Faça um programa que leia um nome de usuário e a sua senha
e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.*/
public class Exercicio2_SenhaNome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String usuario;
        String senha;

        while (true) {
            System.out.println("Usuário:");
            usuario = scan.next();

            System.out.println("Senha:");
            senha = scan.next();
            if (usuario.equals(senha)) {
                System.out.println("Erro: Nome de usuário e senha devem ser diferentes.");
            } else {
                break;
            }
        }
    }
}

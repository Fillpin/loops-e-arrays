package br.com.dio.exercicios.loops.pythonbrasil;

import java.util.Scanner;

/*Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';
* */
public class Exercicio3_ValidarInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        int salario;
        String sexo;
        //String[] listaEstadoCivil = {"s", "c", "v", "d"};
        String estadoCivil;


        do {System.out.println("Nome: ");
            nome = scan.next();
            if (nome.length() <= 3) {
                System.out.println("O Nome deve possuir mais que 3 caracteres.");
            }
        } while (nome.length() <= 3);

        do {System.out.println("Idade: ");
            idade = scan.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("Idade deve ser um número válido (entre 0 e 150).");
            }
        } while (idade < 0 || idade > 150);

        do {System.out.println("Salário: ");
            salario = scan.nextInt();
            if (salario <= 0) {
                System.out.println("O Salário deve ser maior que zero.");
            }
        } while (salario <= 0);

        do {System.out.println("Sexo: ");
            sexo = scan.next();
            if (!(sexo.equals("f") || sexo.equals("m"))) {
                System.out.println("O sexo deve ser definido como: 'f'(feminino) ou 'm'(masculino).");
            }
        } while (!(sexo.equals("f") || sexo.equals("m")));


        do {System.out.println("Estado Civil: ");
            estadoCivil = scan.next();
            if (!(estadoCivil.equals("s") || estadoCivil.equals("c") || estadoCivil.equals("v")) || estadoCivil.equals("d")) {
                System.out.println("O Estado Civil deve ser definido como: 's'(solteiro), 'c'(casado), 'v'(viúvo), 'd'(divorciado).");
            }
        } while (!(estadoCivil.equals("s") || estadoCivil.equals("c") || estadoCivil.equals("v")) || estadoCivil.equals("d"));

    }
}

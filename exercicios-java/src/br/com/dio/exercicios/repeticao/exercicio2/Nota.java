package br.com.dio.exercicios.repeticao.exercicio2;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota = 0;


        while(true){

            System.out.println("Informe a nota do Aluno");
            nota = sc.nextDouble();

            if (nota <= 10 && nota >= 0){

                System.out.println("Nota salva com sucesso");

                break;

            }

            System.out.println("Informe uma nota válida");

        }

    }
}

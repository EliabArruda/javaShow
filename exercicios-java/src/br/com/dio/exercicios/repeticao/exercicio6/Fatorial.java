package br.com.dio.exercicios.repeticao.exercicio6;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 1;
        int fatorial = 1;

        System.out.println("Informe um número:");
        numero = sc.nextInt();

        System.out.print(numero + "! -> ");

        for (int i = numero; i > 1;i--){

           fatorial *= i;

            System.out.print(i + " x ");

        }

        System.out.println("1 = " + fatorial);


    }
}

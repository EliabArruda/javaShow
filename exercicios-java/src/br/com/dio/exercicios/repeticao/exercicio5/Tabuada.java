package br.com.dio.exercicios.repeticao.exercicio5;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int numero = 0;
        int tabuada = 0;
        int i = 0;

        System.out.println("Informe o número que deseja ver a tabuada: ");
        numero = sc.nextInt();

        for (i = 0; i <= 10; i++) {

            tabuada = numero * i;

            System.out.println(numero + " x " + i + " = " + tabuada);

        }


    }
}

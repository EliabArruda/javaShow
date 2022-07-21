package br.com.dio.exercicios.repeticao.exercicio3;

import java.util.Scanner;

public class MaiorEMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float numero = 0;
        float media = 0;
        float soma = 0;
        float maior = 0;

        for(int i = 1;i <= 5; i++){

            System.out.println("Informe o " + (i) + "° número");
            numero = sc.nextFloat();

            soma = soma + numero;

            if(numero > maior){

                maior = numero;

            }
        }


        media = soma/5;

        System.out.println("A média é: " + media);
        System.out.println("O maior número é " + maior);


    }
}

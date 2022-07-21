package br.com.dio.exercicios.repeticao.exercicio4;

import java.util.Scanner;

public class ParEImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int quantidadeNumeros = 0;
        int numero = 0;
        int quantidadePares = 0;
        int quantidadeImpares = 0;


        System.out.println("Informe a quantidade de números:");
        quantidadeNumeros = sc.nextInt();


        for(int i = 0; i < quantidadeNumeros; i++){


            System.out.println("Informe o " + (i + 1) + "° número");
            numero = sc.nextInt();

            if(numero % 2 == 0){

                quantidadePares++;


            } else if(numero % 2 == 1){

                quantidadeImpares++;


            }


        }

        System.out.println("Nessa fila existem " + quantidadePares + " números pares");
        System.out.println("Nessa fila existem " + quantidadeImpares + " números impares");




    }
}

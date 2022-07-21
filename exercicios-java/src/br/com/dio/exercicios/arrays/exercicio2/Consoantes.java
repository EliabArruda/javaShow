package br.com.dio.exercicios.arrays.exercicio2;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String consoantes[] = new String[6];
        int quantidadeConsoantes = 0;

        for (int i = 0; i < consoantes.length; i++) {

            System.out.println("Digite uma Letra:");
            String letras = sc.next();

            if (!(letras.equalsIgnoreCase("a") ||
                    letras.equalsIgnoreCase("e") ||
                    letras.equalsIgnoreCase("i") ||
                    letras.equalsIgnoreCase("o") ||
                    letras.equalsIgnoreCase("u"))) {


                consoantes[i] = letras;
                quantidadeConsoantes++;

            }

        }

        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {

            if (consoante != null) {
                System.out.print(consoante + " ");
            }

        }

        System.out.print("\nQuantidade de Consoantes: " + quantidadeConsoantes);


    }
}

package br.com.dio.exercicios.arrays.exercicio3;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int numerosAleatorios[] = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números Aleatórios:     |");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.print("|");

        System.out.print("\nSucessores dos Números: |");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");

        }
        System.out.println("|");
    }
}

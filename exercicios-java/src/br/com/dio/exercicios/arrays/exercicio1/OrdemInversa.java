package br.com.dio.exercicios.arrays.exercicio1;

import javax.swing.*;

public class OrdemInversa {

    public static void main(String[] args) {

        int numero[] = {2, 4, 8, 1, 3, 5};

        System.out.print("Ordem Inversa: ");

        for(int i = (numero.length - 1); i >= 0; i--){


            System.out.print(numero[i] + "  ");
        }
    }
}

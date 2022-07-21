package br.com.dio.exercicios.metodos.exercicio2;

public class Quadrilatero {


    public void area(float lado) {

        float quadrado = lado * lado;

        System.out.println("A área do quadrado é: " + quadrado + "cm²");

    }

    public void area(float lado1, float lado2) {

        float retangulo = lado1 * lado2;

        System.out.println("A área do retângulo é: " + retangulo + "cm²");

    }

    public void area(float baseMaior, float baseMenor, float altura) {

        float trapezio = ((baseMaior + baseMenor) * altura) / 2;

        System.out.println("A área do trapézio é: " + trapezio + "cm²");
    }
}

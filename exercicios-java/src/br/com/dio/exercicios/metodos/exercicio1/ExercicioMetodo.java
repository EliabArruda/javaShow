package br.com.dio.exercicios.metodos.exercicio1;

import java.util.Formatter;
import java.util.Calendar;

public class ExercicioMetodo {

    public static void main(String[] args) {

        //Exercício de Criação e Utilização de Métodos

        ExercicioMetodo t = new ExercicioMetodo();
        Formatter formate = new Formatter();

        //Instância da Classe 'Calculadora'
        Calculadora calculadora = new Calculadora();


        calculadora.executarSoma(5, 2);
        calculadora.executarDivisao(8, 4);
        calculadora.executarSubtracao(70, 5);
        calculadora.executarMultiplicacao(50, 10);
        calculadora.executarTodasOperacoes(10, 2);
        t.FormatarHora();


    }


    //Método de formatação de hora 'HH:MM:SS'
    private void FormatarHora() {

        // Create Formatter class object
        Formatter formate = new Formatter();

        // Creating a calendar
        Calendar calendario = Calendar.getInstance();

        // Displaying hour using Format class using format
        // specifiers
        // '%tT' for hours and minutes 'HH:MM:SS'
        formate = new Formatter();

        formate.format("%tT", calendario,
                calendario);

        System.out.println(formate + "\n");


    }


}



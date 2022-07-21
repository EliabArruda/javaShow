package br.com.dio.exercicios.metodos.exercicio1;

public class Calculadora {

    //Métodos Privados

    /*
    * Métodos com as regras de negócio
    * que não podem ser chamados diretamente
    */
    private void soma(int a, int b) {

       int soma = a + b;

        System.out.println("Soma: " + a + " + " + b + " = " + soma);
    }
    private void subtracao(int a, int b) {

        int subtracao = a - b;

        System.out.println("Subtração: " + a + " - " + b + " = " + subtracao);
    }
    private void multiplicacao(int a, int b) {

        int multiplicacao = a * b;

        System.out.println("Multiplicação: " + a + " * " + b + " = " + multiplicacao);
    }
    private void divisao(int a, int b) {

        int divisao=  a / b;

        System.out.println("Divisão: " + a + " / " + b + " = "  + divisao);
    }

    //Métodos Públicos
    /*
    Métodos apenas para a execução das operações
     */
    public void executarSoma(int a, int b) {

        soma(a, b);

    }
    public void executarSubtracao(int a, int b) {

        subtracao(a, b);

    }
    public void executarMultiplicacao(int a, int b) {

        multiplicacao(a, b);
    }
    public void executarDivisao(int a, int b) {

        divisao(a, b);

    }

    public void executarTodasOperacoes(int a, int b) {

        soma(a, b);
        subtracao(a, b);
        multiplicacao(a, b);
        divisao(a, b);
    }

}

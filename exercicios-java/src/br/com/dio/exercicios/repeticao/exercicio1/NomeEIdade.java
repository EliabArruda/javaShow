package br.com.dio.exercicios.repeticao.exercicio1;

import java.util.Scanner;

public class NomeEIdade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String aluno = "";
        int idade;

           while(true) {
               System.out.println("Informe o nome do Aluno: ");
               aluno = sc.next();
               if(aluno.equals("0")) {

                   break;
               }

               System.out.println("Informe a idade do Aluno: ");
               idade = sc.nextInt();

               }

        System.out.println("Finalizado com sucesso");

           }
}

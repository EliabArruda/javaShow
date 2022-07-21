package br.com.dio.exercicios.collections.list.exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList1 {
    public static void main(String[] args) {

        int contador = 0;


        System.out.println("Exibindo lista de 7 notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(0d);
        notas.add(10.0);
        notas.add(9.2);
        notas.add(4.6);
        notas.add(10d);
        notas.add(5d);
        System.out.println(notas);
        System.out.println();

        /*System.out.println("Todas as posições da Lista: ");
        for (contador = notas.indexOf(notas.get(0)); contador <= notas.size(); contador++) {

            System.out.println(contador);

        }
        System.out.println();

         */

        //Notas de cada posição
        double notaPosicaoZero = notas.get(0);
        double notaPosicaoUm = notas.get(1);
        double notaPosicaoDois = notas.get(2);
        double notaPosicaoTres = notas.get(3);
        double notaPosicaoQuatro = notas.get(4);
        double notaPosicaoCinco = notas.get(5);
        double notaPosicaoSeis = notas.get(6);

        //maior e menor nota
        double menorNota = Collections.min(notas);
        double maiorNota = Collections.max(notas);

        //quantidade de notas
        int quantidadeNotas = notas.size();



        System.out.println("Exiba posição da nota 5.0: está na posição " + notas.indexOf(5d)  + "\n");

        System.out.println("Adicione na lista a nota 8.0 na posição 4 ");
        notas.add(4, 8d);
        System.out.println(notas);
        System.out.println("A lista agora tem " + quantidadeNotas + " notas");
        System.out.println();


        System.out.println("Substitua a nota 5d pela nota 6d");
        System.out.println("Antes da Substituição: " + notas);
        notas.set(notas.indexOf(notaPosicaoCinco), 6d);
        System.out.println("Depois da Substituição: " + notas);
        System.out.println();


        //exibe notas de cada posição
        System.out.println("Exiba a terceira nota adicionada: nota " + notaPosicaoDois);
        System.out.println(notas);
        System.out.println();


        System.out.println("Exiba a menor nota: a menor nota é " + menorNota);
        System.out.println(notas);
        System.out.println();


        System.out.println("Exiba a maior nota: a maior nota é " + maiorNota);
        System.out.println(notas);
        System.out.println();

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
       while(iterator.hasNext()){
           Double proximo = iterator.next();
           soma += proximo;
       }
        System.out.println(soma);
        System.out.println();


        System.out.println("Exiba a média das notas: ");
        Double media = soma / quantidadeNotas;
        System.out.println(media);
        System.out.println();


        System.out.println("Remova a nota 0 da Lista: ");
        System.out.println("Antes da remoção " + notas);
       notas.remove(0d);
        System.out.println("Após a remoção: " + notas);
        System.out.println();


        System.out.println("Remova a posição 0 da Lista: ");
        System.out.println("Antes da remoção " + notas);
        notas.remove(0);
        System.out.println("Após a remoção: " + notas);
        System.out.println();


        System.out.println("Remova as notas menores que 7: ");
        System.out.println("Antes da remoção: " + notas);
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double proximo = iterator1.next();

            if (proximo < 7){
                iterator1.remove();
            }
        }

        System.out.println("Após remoção: " + notas);

        System.out.println();


        System.out.println("Remova toda a Lista: ");
        System.out.println("Antes da remoção: " + notas);
        notas.clear();
        System.out.println("Após remoção: " + notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

    }

}

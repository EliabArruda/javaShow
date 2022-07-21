package br.com.dio.exercicios.collections.list.exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ExemploOrdenacaoList {
    public static void main(String[] args) {



        List<Gato> gatos = new ArrayList<>(){{

            add(new Gato("Brave", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));

        }};

        System.out.println("Ordem de Inserção:\n" + gatos);

        System.out.println("Ordem Aleatória: ");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("Ordem Natural(Nome): ");
        Collections.sort(gatos);
        System.out.println(gatos);


        System.out.println("Ordem por Idade: ");
        //Collections.sort();

        //System.out.println("Ordem por Cor: ");

        //System.out.println("Ordem por Idade: ");



    }
}

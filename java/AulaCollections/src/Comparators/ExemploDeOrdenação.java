package Comparators;

import java.util.*;

public class ExemploDeOrdenação {
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Marina ", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("SEM ORDENAÇÃO");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());//Sintaxe Lambda

        System.out.println("ORDENAÇÃO NATURAL DOS NÚMEROS - IDADE");
        System.out.println(estudantes);

        System.out.println("ORDENAÇÃO INVERSA DOS NÚMEROS - IDADE");
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade()); //Sintaxe Lambda
        System.out.println(estudantes);

        System.out.println("ORDENAÇÃO NATURAL DOS NÚMEROS - IDADE");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(estudantes);

        System.out.println("ORDENAÇÃO INVERSA DOS NÚMEROS - IDADE");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(estudantes);

        System.out.println("ORDENAÇÃO NATURAL DOS NÚMEROS - IDADE");
        Collections.sort(estudantes); //Precisa ter a interface "Comparable" implementada na classe
        System.out.println(estudantes);

        System.out.println("ORDENAÇÃO INVERSA DOS NÚMEROS - IDADE");
        Collections.sort(estudantes, new ExemploComparatorInverso()); //Usou a classe Comparator que Criamos
        System.out.println(estudantes);





    }
}

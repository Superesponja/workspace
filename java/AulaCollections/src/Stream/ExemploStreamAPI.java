package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        //número de estudantes
        System.out.println("Contagem: " + estudantes.stream().count());
        //maximo de letras
        System.out.println("Maior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));
        //mínimo de letras
        System.out.println("Menor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Elementos com a letra R no nome
        System.out.println("Nomes com a letra 'r'" + estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        System.out.println("Retorna uma coleção com a quantidade de letras" + estudantes.stream().map(estudante -> estudante.concat(" - " ).concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        System.out.println("Retorna os três primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));
        System.out.println(estudantes);
        //Exemplo de operação encadeada:
        System.out.println("OPERAÇÃO ENCADEADA");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) ->
                        estudante.toLowerCase().contains("r"))
                //.collect(Collectors.toList()));
                //.collect(Collectors.joining(", ")));
                //.collect(Collectors.toSet()));
                .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-")))));

    }
}

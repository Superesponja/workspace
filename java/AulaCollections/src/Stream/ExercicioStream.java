package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioStream {
    public static void main(String[] args) {
        List<Estudante> alunos = new ArrayList<>();
        alunos.add(new Estudante("José", 19));
        alunos.add(new Estudante("Ramon", 17));
        alunos.add(new Estudante("Lia", 14));
        alunos.add(new Estudante("Marina", 30));
        alunos.add(new Estudante("Adalberto", 44));
        alunos.add(new Estudante("Jeremias", 12));
        alunos.add(new Estudante("Ivo", 18));
        alunos.add(new Estudante("Beatriz", 29));

        //Letra A
        System.out.println("Letra A:");
        System.out.println(alunos.stream().map(aluno -> aluno.getNome().concat(" - ").concat(String.valueOf(aluno.getIdade()))).collect(Collectors.joining(" | ")));

        //Letra B
        System.out.println("Letra B");
        System.out.println(alunos.stream().count());

        //Letra C
        System.out.println("Letra C");
        System.out.println(alunos.stream().filter(aluno -> aluno.getIdade()>=18).map(aluno -> aluno.getNome().concat(" - ").concat(String.valueOf(aluno.getIdade()))).collect(Collectors.toList()));

        //Letra D
        System.out.println("Letra D");
        alunos.forEach(aluno -> System.out.println(aluno.getNome()));

        //Letra E
        System.out.println("Letra E");
        System.out.println(alunos.stream().filter((aluno) -> aluno.getNome().toLowerCase().contains("b")).map(aluno -> aluno.getNome()).collect(Collectors.toList()));

        //Letra F
        System.out.println("Letra F");
        System.out.println(alunos.stream().anyMatch(aluno -> aluno.getNome().toLowerCase().contains("d")));

        //Letra G
        System.out.println("Letra G");
        System.out.println(alunos.stream().max(Comparator.comparingInt(Estudante::getIdade)).map(aluno -> aluno.getNome().concat("(" + aluno.getIdade())).get() + ")");
        System.out.println(alunos.stream().min(Comparator.comparingInt(Estudante::getIdade)).map(aluno -> aluno.getNome().concat("(" + aluno.getIdade())).get() + ")");
    }
}

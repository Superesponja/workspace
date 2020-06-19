package Set;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();
//não guarda ordem de inclusão
        notasAlunos.add(10.0);//adiciona itens
        notasAlunos.add(8.3);
        notasAlunos.add(4.7);
        notasAlunos.add(8.1);
        notasAlunos.add(2.9);
        notasAlunos.add(6.0);
        notasAlunos.add(7.2);

        System.out.println(notasAlunos);

        notasAlunos.remove(4.7);//remove itens

        System.out.println(notasAlunos);

        for(Double nota: notasAlunos){
            System.out.println(nota);
        }

    }
}

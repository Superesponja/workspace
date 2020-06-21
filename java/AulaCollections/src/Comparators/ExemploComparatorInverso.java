package Comparators;

import java.util.Comparator;

public class ExemploComparatorInverso implements Comparator<Estudante> {

    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o2.getIdade() - o1.getIdade();
    }
        //classe criada para comparar objetos "EStudante através do método "compare"
}

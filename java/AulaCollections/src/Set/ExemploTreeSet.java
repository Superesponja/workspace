package Set;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> capitais = new TreeSet<>();

        capitais.add("São Paulo");
        capitais.add("Curitiba");
        capitais.add("São Luís");
        capitais.add("Manaus");
        capitais.add("Boa Vista");
        capitais.add("Goiania");
        capitais.add("Vitória");

        System.out.println(capitais);

        System.out.println(capitais.first());//primeiro nó (topo da árvore)
        System.out.println(capitais.last());//último nó (final da árvore)
        System.out.println(capitais.lower("São Luis"));//elemento abaixo do informado
        System.out.println(capitais.higher("São Luis"));//elemento acima do informado
        //pollFirst e pollLast remove os elementos e os retorna
        System.out.println(capitais.pollFirst());
        System.out.println(capitais.pollLast());

        for (String nodo: capitais){
            System.out.println(nodo);
        }



    }

}

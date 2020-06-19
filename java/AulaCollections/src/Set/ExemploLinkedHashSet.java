package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        Set<Double> exemplo = new LinkedHashSet<>();

//não guarda ordem de inclusão
        exemplo.add(10.0);//adiciona itens
        exemplo.add(8.3);
        exemplo.add(4.7);
        exemplo.add(8.1);
        exemplo.add(2.9);
        exemplo.add(6.0);
        exemplo.add(7.2);

        System.out.println(exemplo.size());

        exemplo.remove(4.7);//remove itens

        System.out.println(exemplo);

        for(Double nota: exemplo) {
            System.out.println(nota);
        }
    }
}

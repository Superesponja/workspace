package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();//cria a lista

        nomes.add("Carlos");//adiciona elementos
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2, "Larissa");//altera o elemento do indice

        Collections.sort(nomes);//ordena

        System.out.println(nomes);

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove("Wesley");//remove o elemento do índice

        System.out.println(nomes);

        String nome = nomes.get(3);//pega o elemento

        System.out.println(nome);

        System.out.println(nomes.indexOf("Carla"));//retorna o índice do elemento pesquisado; caso não haja, retorna -1

        System.out.println(nomes.isEmpty()); //verifica se a lista está vazia

        for (String nomeItem: nomes) { //foreach, você indica como se chamará cada elemento e qual a lista
            // e ele percorre o aray pegando cada item
            System.out.println("-->" + nomeItem);
        }
        
        Iterator<String> iterator = nomes.iterator();//Iterator eh uma lista feita para ser percorrida

        while (iterator.hasNext()){//verifica se tem mais itens
            System.out.println("--->" + iterator.next());

        }

    }
}

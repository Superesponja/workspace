package List;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {

        List<String> esportes = new Vector<>();//instancia objeto vector

        esportes.add("Futebol"); //adiciona elementos
        esportes.add("Basquetebol");
        esportes.add("Tenis de Mesa");
        esportes.add("Handebol");

        esportes.set(2, "Ping Pong");//altera o elemento do índice

        esportes.remove(2);//remove o elemento do índice

        esportes.remove("Basquetebol");//remove o elemento(se existir)

        System.out.println(esportes.get(0));//retorna o elemento pelo índice

        for(String esporte: esportes) {//navega no vetor
            System.out.println(esporte);
        }
    }

}

package Map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoesFIFA = new HashMap<>();

        campeoesFIFA.put("Brasil", 5);
        campeoesFIFA.put("Uruguai", 2);
        campeoesFIFA.put("Argentina", 2);
        campeoesFIFA.put("Italia", 4);
        campeoesFIFA.put("França", 1);
        campeoesFIFA.put("Alemanha", 4);

        System.out.println(campeoesFIFA);

        campeoesFIFA.put("França", 2);//insere ou altera o valor da chava informada

        System.out.println(campeoesFIFA);

        campeoesFIFA.get("Italia");

        campeoesFIFA.containsKey("Belgica");

        System.out.println("Agora o tamanho é: " + campeoesFIFA.size());

        System.out.println(campeoesFIFA.containsValue(3));

        for(Map.Entry<String, Integer> chaveValor: campeoesFIFA.entrySet()){
            System.out.println("Seleção: "+ chaveValor.getKey() + " | Títulos: " + chaveValor.getValue());
        }

        for(String key: campeoesFIFA.keySet()){
            System.out.println("Seleção: " + key + " || Títulos: " + campeoesFIFA.get(key));
        }

        System.out.println("Fiz o clear\n");

        campeoesFIFA.clear();

        System.out.println("Agora o tamanho é: " + campeoesFIFA.size());

    }
}

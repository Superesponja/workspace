package Optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
        Optional<String> optinalString = Optional.of("Valor Opcional");

        System.out.println(optinalString.isPresent());

        optinalString.ifPresent(System.out::println);

        optinalString.ifPresentOrElse(System.out::println, () -> System.out.println("Valor Não está presente"));

        if(optinalString.isPresent()){
            String valor = optinalString.get();
            System.out.println(valor);
        }

        optinalString.map((valor) -> valor.concat("****")).ifPresent(System.out::println);

        optinalString.orElseThrow(IllegalStateException::new);
    }
}

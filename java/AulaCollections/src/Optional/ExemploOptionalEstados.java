package Optional;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor Presente");

        System.out.println("Valor Opicional está presente!");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente :("));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor Opicional não está presente :(");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = Não está presente :("));

        Optional<String> optionalVazio = Optional.empty();

        System.out.println("Valor Opicional não está presente :(");
        optionalVazio.ifPresentOrElse(System.out::println, () -> System.out.println("empty = Não está presente :("));

        Optional<String> optionalErro = Optional.of(null);

        System.out.println("Valor Opicional que lança o ERRO FORBIDEN! :S");
        optionalErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = Não está presente :("));
    }
}

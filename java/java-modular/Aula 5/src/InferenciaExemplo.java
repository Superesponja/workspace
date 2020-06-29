import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class InferenciaExemplo {

    public static void main(String[] args) throws IOException {
        imprimirNome("Renan");
        imprimirSoma(8,6);
    }

    private static void connectionJavaOracle() throws IOException {
        var url = new URL("https://docs.oracle.com/javase/10/language/");
        var urlConnection = url.openConnection();
        var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
    }

    public static void imprimirNome (String nome){ //(var nome) não funciona; VAR não funciona como parâmero
        System.out.println("nome");
    }

    public static void imprimirSoma (int... numeros){
        int soma=0;
        //var soma; não funciona em variáveis não inicializadas.
        for (var numero : numeros ){
            soma += numero;
        }

        for(var numero=0; numero<numeros.length; numero++){
            soma+=numeros[numero];
        }
        System.out.println(soma);
    }


}

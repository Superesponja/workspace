import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClienteExemplo {
    public static void main(String[] args) throws IOException, InterruptedException {
        connectAndPrintURL();
    }

    private static void connectAndPrintURL() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://docs.oracle.com/javase/10/language/"))
                .build();

        HttpClient cliente = HttpClient.newHttpClient();

        HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status Code:" + response.statusCode());
        System.out.println("Response Headers:" + response.headers());
        System.out.println(response.body());

    }
}

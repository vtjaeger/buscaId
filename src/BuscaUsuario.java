import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaUsuario {
    public Usuario buscarUsuario(String id) {
        URI endereco = URI.create("https://jsonplaceholder.typicode.com/todos/" + id);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Usuario.class);
        } catch (Exception ex) {
            throw new RuntimeException("Nao foi possivel localizar esse usuario");
        }
    }
}

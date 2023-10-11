import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorArquivoJson {
    public void geraJson(Usuario endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting()
                .create();

        FileWriter escrita = new FileWriter(endereco.id() + ".json");
        escrita.write(gson.toJson(endereco));
        escrita.close();
    }
}

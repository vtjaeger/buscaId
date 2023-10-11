import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID desejado:");
        String id = scanner.nextLine();
        BuscaUsuario usuario = new BuscaUsuario();

        try{
            Usuario novoUser = usuario.buscarUsuario(id);
            System.out.println(novoUser);

            GeradorArquivoJson gerador = new GeradorArquivoJson();
            gerador.geraJson(novoUser);
        } catch (RuntimeException | IOException ex){
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("encerrando");
        }

    }
}
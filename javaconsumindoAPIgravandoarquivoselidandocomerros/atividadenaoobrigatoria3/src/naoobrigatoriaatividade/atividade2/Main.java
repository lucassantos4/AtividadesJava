package naoobrigatoriaatividade.atividade2;

import java.awt.geom.Area;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o usuario para consulta: ");
            String usuario = input.nextLine().strip().replace(" ", "+").toLowerCase();

            URL url = new URL("https://api.github.com/users/" + usuario);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int codigoResposta = connection.getResponseCode();
            if (codigoResposta == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader((connection.getInputStream())));
                String string;
                StringBuilder stringBuilder = new StringBuilder();
                while ((string = reader.readLine()) != null) {
                    stringBuilder.append(string);
                }
                reader.close();
                System.out.println(stringBuilder.toString());
            } else if (codigoResposta == 404) {
                throw new ErroConsultaGitHubException("Usuario do GitHub não encotrado!");
            } else {
                throw new ErroConsultaGitHubException("Erro ao consultar usuario: codigo " + usuario);
            }
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        } catch (IOException ioe) {
            System.out.println("Erro de conexão " + ioe.getMessage());
        }

    }
}

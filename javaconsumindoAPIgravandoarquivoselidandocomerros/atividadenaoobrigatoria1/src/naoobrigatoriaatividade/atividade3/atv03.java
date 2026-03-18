package naoobrigatoriaatividade.atividade3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class atv03 {
    static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite nome da receita: ");
        String buscaReceita = "https://www.themealdb.com/api/json/v1/1/search.php?s=" +
                scanner.nextLine().replace(" " , "%20");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(buscaReceita)).build();
        HttpResponse<String> response = client.send(request ,HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        scanner.close();
    }
}

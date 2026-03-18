package naoobrigatoriaatividade.atividade1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class atv01 {
    static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Busque um livro: ");
        var buscaLivros = new StringBuilder().append("https://www.googleapis.com/books/v1/volumes?q=")
                .append(scanner.nextLine().replace(" ", "+")).toString();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(buscaLivros)).build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


        scanner.close();
    }

}

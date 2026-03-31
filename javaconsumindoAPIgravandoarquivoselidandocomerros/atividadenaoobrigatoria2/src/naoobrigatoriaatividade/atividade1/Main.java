package naoobrigatoriaatividade.atividade1;


public class Main {

    static void main(String[] args) {

        String jsonPesoa = "{\"nome\": \"João Silva\", \"idade\": 30, \"cidade\": \"São Paulo\"}";

        Gson gson = new Gson();

        Pessoa pessoa = gson.fromJson(jsonPesoa, pessoa.class);
    }
}

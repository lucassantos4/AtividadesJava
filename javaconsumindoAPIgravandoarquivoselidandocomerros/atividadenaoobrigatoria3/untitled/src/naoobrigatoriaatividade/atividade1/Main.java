package naoobrigatoriaatividade.atividade1;
import com.google.gson.Gson ;

public class Main {


    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = "{\"nome\": \"Lucas\", \"idade\": 25, \"cidade\": \"São Paulo\"}";
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);

        String JsonExtra = "{\"nome\": \"Lucas\", \"idade\": 25, \"cidade\": \"São Paulo\", \"profissao\": \"Desenvolvedor\"}";
        Pessoa pessoaExtra = gson.fromJson(JsonExtra, Pessoa.class);
        System.out.println( "Extra" + pessoaExtra);

        String JsonFalta = "{\"nome\": \"Lucas\", \"cidade\": \"São Paulo\"}";
        Pessoa pessoaFalta = gson.fromJson(JsonFalta, Pessoa.class);
        System.out.println("Falta" + pessoaFalta);
        String JsonLivro = """
                {
                "titulo": "Entendendo Algoritmos",
                "autor": "Aditya Y. Bhargava",
                "editora": {
                    "nome": "Novatec"
                    }
                }
                """;

        Livro livro = gson.fromJson(JsonLivro, Livro.class);
        System.out.println(livro);
    }

}

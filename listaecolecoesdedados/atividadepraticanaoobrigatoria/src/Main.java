import java.util.ArrayList;

public class Main {

    static void main(String[] args) {
        Pessoa lucas = new Pessoa();
        lucas.setNome("Lucas");
        lucas.setIdade(21);

        System.out.println(lucas);

        Pessoa isabel = new Pessoa();
        isabel.setNome("Isabel");
        isabel.setIdade(20);

        System.out.println(isabel);

        var aurora = new Pessoa();
        aurora.setNome("Aurora");
        aurora.setIdade(24);

        System.out.println(aurora);

        var octavio = new Pessoa();
        octavio.setNome("Octavio");
        octavio.setIdade(17);

        System.out.println(octavio);

        ArrayList<Pessoa> listaDePessoa = new ArrayList<>();
        listaDePessoa.add(lucas);
        listaDePessoa.add(isabel);
        listaDePessoa.add(aurora);
        listaDePessoa.add(octavio);

        System.out.println("Tamanho da lista: " + listaDePessoa.size());
        System.out.println("Primeira pessoa da lista: "+ listaDePessoa.getFirst());
        System.out.println("Lista de pessoas: ");
        for (Pessoa pessoa : listaDePessoa) {
            System.out.println(pessoa);
        }

    }


}

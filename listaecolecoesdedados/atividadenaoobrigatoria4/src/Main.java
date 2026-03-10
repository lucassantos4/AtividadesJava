import javax.swing.*;
import java.util.*;

public class Main {
    static void main(String[] args) {


//          Crie uma lista de números inteiros e utilize o
//          método Collections.sort para ordená-la em ordem
//          crescente.
//          Em seguida, imprima a lista ordenada.

        var listaDeInteiros = new ArrayList<Integer>();
        listaDeInteiros.add(4);
        listaDeInteiros.add(1);
        listaDeInteiros.add(2);
        listaDeInteiros.add(3);
        listaDeInteiros.add(5);

        System.out.println("Lista de inteiros: "+ listaDeInteiros);

        Collections.sort(listaDeInteiros);
        System.out.println("Lista ordenada de inteiros: " + listaDeInteiros);


/*
       Crie uma classe Titulo com um atributo nome do tipo String.
       Implemente a interface Comparable na classe para que seja
       possível ordenar uma lista de objetos Titulo.

       No Exercício 2, crie alguns objetos da classe Titulo e
       adicione-os a uma lista. Utilize o método Collections. sort
       para ordenar a lista e, em seguida, imprima os títulos ordenados.
*/

        Titulo filme1 = new Titulo("Duna");
        Titulo filme2 = new Titulo("Avangers");
        var filme3 = new Titulo("Cidade de Deus");
        var filme4 = new Titulo("Bee movie");

        List<Titulo> listaTitulo = new ArrayList<>();
        listaTitulo.add(filme1);
        listaTitulo.add(filme2);
        listaTitulo.add(filme3);
        listaTitulo.add(filme4);

        System.out.println("Lista desordenada: ");
        for ( Titulo t : listaTitulo ) {

            System.out.println(t.getNome());
        }


        System.out.println("Lista ordenada: ");
        Collections.sort(listaTitulo);
        for ( Titulo item : listaTitulo ) {

            System.out.println(item.getNome());

        }

/*
        Crie uma lista utilizando a interface List e instancie-a tanto como
        ArrayList quanto como LinkedList. Adicione elementos e imprima a lista,
        mostrando que é possível trocar facilmente a implementação.

        Modifique o exercício para declarar a variável de lista
        como a interface List, demonstrando o uso de polimorfismo.
*/
        List<String> listaString;

        listaString = new ArrayList<>();
        listaString.add("a");
        listaString.add("b");
        System.out.println("Arraylist: " + listaString);

        listaString = new LinkedList<>();
        listaString.add("c");
        listaString.add("d");
        System.out.println("LinkedList: " + listaString);



    }
}

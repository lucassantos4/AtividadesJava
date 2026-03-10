package obrigatorianaoatividade.calculo;

public class Livros implements Calculavel {

    @Override
    public double calcularPrecoFinal(double preco){
        double taxaAdicional = (preco * 10) / 100;
        return preco + taxaAdicional;
    }

    static void main() {
        Livros livro = new Livros();
        System.out.println(livro.calcularPrecoFinal(10));
    }
}

package obrigatorianaoatividade.calculo;

public class ProdutoFisico implements Calculavel {

    @Override
    public double calcularPrecoFinal(double preco){
        double descontoCompraFisica = (preco * 10 ) / 100;
        return preco - descontoCompraFisica;

    }

    static void main() {
        ProdutoFisico produto = new ProdutoFisico();
        System.out.println(produto.calcularPrecoFinal(10));

    }
}

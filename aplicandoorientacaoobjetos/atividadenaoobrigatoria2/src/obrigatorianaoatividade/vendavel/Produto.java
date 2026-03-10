package obrigatorianaoatividade.vendavel;

public class Produto implements Vendavel {
    private double precoUnitario;


    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    @Override
    public double calculoPrecoTotal(int quantidade){
        double total = this.precoUnitario * quantidade;
        if (quantidade >= 5) {
            total *= 0.9;
        }

        return total;

    }

    static void main() {
        Produto produto = new Produto();
        produto.setPrecoUnitario(10);

        System.out.println(produto.calculoPrecoTotal(10));
    }
}

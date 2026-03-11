public class Compra implements Comparable<Compra> {
    private  String descricao;
    private double valor;

    public Compra(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Compra: descricao =" + descricao + ", valor: " + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return  Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }

}

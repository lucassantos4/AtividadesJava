public class ProdutoPerecivel extends Produto{

    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, String dataValidade) {
        this.dataValidade = dataValidade;
        super(nome, preco);
    }

    @Override
    public String toString() {
        return "Produto: " + getNome() + " (Validade: " + dataValidade + ")";
    }
}

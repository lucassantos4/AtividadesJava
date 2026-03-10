package obrigatorianaoatividade.vendavel;

public class Servico implements Vendavel{

    private double precoPorHora;

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    @Override
    public double calculoPrecoTotal(int quantidade) {
        double total = getPrecoPorHora() * quantidade;
        if (quantidade > 20) {
            total *= 0.95;
        }


        return total;
    }

    static void main(String[] args) {
        Servico servico = new Servico();
        servico.setPrecoPorHora(7.5);
        System.out.println(servico.calculoPrecoTotal(8));
    }

}

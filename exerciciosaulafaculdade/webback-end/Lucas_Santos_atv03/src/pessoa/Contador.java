package pessoa;

public class Contador extends Pessoa {

    private String numeroConselho;
    private long Salario;

    public String getNumeroConselho() {
        return numeroConselho;
    }

    public void setNumeroConselho(String numeroConselho) {
        this.numeroConselho = numeroConselho;
    }

    public long getSalario() {
        return Salario;
    }

    public void setSalario(long salario) {
        Salario = salario;
    }
}

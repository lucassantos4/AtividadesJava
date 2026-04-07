package empresa;

import pessoa.Contador;
import pessoa.Socio;

import java.util.ArrayList;
import java.util.List;

public abstract class Empresa {
    private String nome;
    private String cnpj;
    private String end;
    private long faturamento;
    private List<Socio> socios;
    private Contador contador;

    public Empresa(String nome, String cnpj, String end, long faturamento, List<Socio> socios, Contador contador) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.end = end;
        this.faturamento = faturamento;
        this.socios = new ArrayList<>(socios);
        this.contador = contador;
    }

    public long pagamentoImposto(){
        return 0;
    }

    public void exibirSocio(Socio socio) {

        System.out.println("Nome do socio: " + socio.getNome());
        System.out.println("Percentual de participação: " + socio.getPercentParticipacao() + "%");
        System.out.println("Telefone: " + socio.getTelefone());
        System.out.println("Endereço: " + socio.getEndereco());

    }

    public void exibirTodosSocios() {
        for (Socio socio : socios) {
            exibirSocio(socio);
        }
    }

    public void exibirContador() {
        System.out.println("Contador: " + contador.getNome());
        System.out.println("Telefone: " + contador.getTelefone());
        System.out.println("Endereço: " + contador.getEndereco());
        System.out.println("Número do Conselho: " + contador.getNumeroConselho());
        System.out.println("Salário: " + contador.getSalario());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public long getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(long faturamento) {
        this.faturamento = faturamento;
    }

    public List<Socio> getSocios() {
        return socios;
    }

    public void setSocios(List<Socio> socios) {
        this.socios = socios;
    }

    public Contador getContador() {
        return contador;
    }

    public void setContador(Contador contador) {
        this.contador = contador;
    }
}

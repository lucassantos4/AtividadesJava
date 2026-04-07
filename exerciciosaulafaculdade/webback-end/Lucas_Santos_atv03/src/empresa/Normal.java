package empresa;

import pessoa.Socio;

import java.util.List;

public class Normal extends Empresa{
    public Normal(String nome, String cnpj, String end, long faturamento, List<Socio> socios, pessoa.Contador contador) {
        super(nome, cnpj, end, faturamento, socios, contador);

    }

    @Override
    public long pagamentoImposto() {
        return getFaturamento() * 6 / 100 ;
    }
}

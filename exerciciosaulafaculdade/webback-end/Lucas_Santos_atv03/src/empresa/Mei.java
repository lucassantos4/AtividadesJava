package empresa;

import pessoa.Contador;
import pessoa.Socio;

import java.util.List;

public class Mei extends Empresa {

    public Mei(String nome, String cnpj, String end, long faturamento, List<Socio> socios, Contador contador) {
        super(nome, cnpj, end, faturamento, socios, contador);

    }

    @Override
    public long pagamentoImposto() {
        return 8700;
    }

}

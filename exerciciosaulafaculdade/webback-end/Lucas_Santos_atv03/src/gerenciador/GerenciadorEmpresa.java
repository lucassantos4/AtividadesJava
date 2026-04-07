package gerenciador;

import empresa.Empresa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GerenciadorEmpresa {
    private Map<String, Empresa> empresasCadastradas = new HashMap<>();
    private Set<String> cnpjsCadastrados = new HashSet<>();
    private Set<String> nomesCadastrados = new HashSet<>();

    public boolean cadastrar(Empresa empresa) {
        if (cnpjsCadastrados.contains(empresa.getCnpj())) {
            System.out.println("CNPJ ja cadastrado.");
            return false;
        }
        if (nomesCadastrados.contains(empresa.getNome())) {
            System.out.println("Nome ja cadastrado.");
            return false;

        }
        if (!verificaSocio(empresa)) {
            System.out.println("Empresa deve ter pelo menos um socio.");
            return false;
        }
        if (!isCnpjValido(empresa.getCnpj())) {
            System.out.println("CNPJ invalido.");
            return false;
        }
        cnpjsCadastrados.add(empresa.getCnpj());
        nomesCadastrados.add(empresa.getNome());
        empresasCadastradas.put(empresa.getCnpj(), empresa);
        return true;
    }

    public boolean isCnpjValido(String cnpj) {
        String cnpjLimpo = cnpj.replaceAll("[^0-9]", "");
        if (cnpjLimpo.length() != 14) {
            return false;
        }
        if (!cnpjLimpo.matches("\\d{14}"))  {
            return false;
        }
        try {
            Long.parseLong(cnpjLimpo);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public boolean verificaSocio(Empresa empresa) {
        return !empresa.getSocios().isEmpty();
    }

    public Empresa buscarEmpresa(String cnpj) {
        return empresasCadastradas.get(cnpj);
    }

    public void exibirEmpresa(Empresa empresa) {
        System.out.println("Empresa: " + empresa.getNome());
        System.out.println("CNPJ: " + empresa.getCnpj());
        System.out.println("Endereço: " + empresa.getEnd());
        System.out.println("Faturamento: " + empresa.getFaturamento());
        System.out.println("Contador: " + empresa.getContador().getNome());
        System.out.println("Socios:");
        empresa.exibirTodosSocios();
    }
}

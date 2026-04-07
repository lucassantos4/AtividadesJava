import empresa.*;
import gerenciador.GerenciadorEmpresa;
import pessoa.Contador;
import pessoa.Socio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorEmpresa gerenciador = new GerenciadorEmpresa();
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar empresa");
            System.out.println("2 - Buscar empresa por CNPJ");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            int scannerObserver = sc.nextInt();
            sc.nextLine();
            if (scannerObserver == 1) {
                System.out.print("Nome da empresa: ");
                String nome = sc.nextLine();
                System.out.print("CNPJ (ex: 12345678000199 ou 12.345.678/0001-99): ");
                String cnpj = sc.nextLine();
                System.out.print("Endereço: ");
                String end = sc.nextLine();
                System.out.print("Faturamento: ");
                long faturamento = sc.nextLong();
                sc.nextLine();
                // Contador
                System.out.print("Nome do contador: ");
                String nomeContador = sc.nextLine();
                System.out.print("Telefone do contador (ex: (11) 91234-5678): ");
                String telContador = sc.nextLine();
                System.out.print("Endereço do contador: ");
                String endContador = sc.nextLine();
                System.out.print("Número do conselho: ");
                String numConselho = sc.nextLine();
                System.out.print("Salário: ");
                long salario = sc.nextLong();
                sc.nextLine();
                Contador contador = new Contador();
                contador.setNome(nomeContador);
                contador.setTelefone(telContador);
                contador.setEndereco(endContador);
                contador.setNumeroConselho(numConselho);
                contador.setSalario(salario);
                // Sócios
                List<Socio> socios = new ArrayList<>();
                boolean addSocios = true;
                while (addSocios) {
                    System.out.print("Nome do sócio: ");
                    String nomeSocio = sc.nextLine();
                    System.out.print("Telefone do sócio (ex: (11) 91234-5678): ");
                    String telSocio = sc.nextLine();
                    System.out.print("Endereço do sócio: ");
                    String endSocio = sc.nextLine();
                    System.out.print("Percentual de participação (ex: 50 ou 50% ou 50,5): ");
                    String percStr = sc.nextLine().replace(",", ".").replace("%", "").trim();
                    float perc = 0;
                    try {
                        perc = Float.parseFloat(percStr);
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido. Digite um número válido para o percentual.");
                        continue;
                    }
                    Socio socio = new Socio();
                    socio.setNome(nomeSocio);
                    socio.setTelefone(telSocio);
                    socio.setEndereco(endSocio);
                    socio.setPercentParticipacao(perc);
                    socios.add(socio);
                    System.out.print("Adicionar outro sócio? (s/n): ");
                    String resp = sc.nextLine();
                    addSocios = resp.equalsIgnoreCase("s");
                }
                System.out.println("Tipo de empresa (1-Mei, 2-Normal, 3-Simples): ");
                int tipo = sc.nextInt();
                sc.nextLine();
                Empresa empresa = null;
                if (tipo == 1) {
                    empresa = new Mei(nome, cnpj, end, faturamento, socios, contador);
                } else if (tipo == 2) {
                    empresa = new Normal(nome, cnpj, end, faturamento, socios, contador);
                } else if (tipo == 3) {
                    empresa = new Simples(nome, cnpj, end, faturamento, socios, contador);
                } else {
                    System.out.println("Tipo inválido!");
                    continue;
                }
                boolean cadastrado = gerenciador.cadastrar(empresa);
                if (cadastrado) {
                    System.out.println("Empresa cadastrada com sucesso!");
                }
            } else if (scannerObserver == 2) {
                System.out.print("Digite o CNPJ da empresa: ");
                String cnpjBusca = sc.nextLine();
                Empresa emp = gerenciador.buscarEmpresa(cnpjBusca);
                if (emp != null) {
                    gerenciador.exibirEmpresa(emp);
                } else {
                    System.out.println("Empresa não encontrada.");
                }
            } else if (scannerObserver == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}

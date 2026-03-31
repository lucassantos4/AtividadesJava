import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        byte opcao = -1;

        while (opcao != 0) {
            System.out.println("""
                    ========= escola =========
                    1 - Listar Alunos e Resultados
                    2 - Cadastrar Novo Aluno
                    0 - Sair
                    Escolha uma opção:
                    """);
            
            opcao = scanner.nextByte();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    exibirRelatorio(listaAlunos);
                    break;
                case 2:
                    cadastrar(scanner, listaAlunos);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void cadastrar(Scanner scanner, ArrayList<Aluno> lista) {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        double[] notas = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        
        Aluno novoAluno = new Aluno(nome, notas);
        lista.add(novoAluno);
        System.out.println("Aluno cadastrado");
    }

    public static void exibirRelatorio(ArrayList<Aluno> lista) {
        if (lista.isEmpty()) {
            System.out.println("Nenhum aluno");
            return;
        }

        System.out.println("\n--- LISTA ALUNOS ---");
        for (Aluno aluno : lista) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Média: " + String.format("%.2f", aluno.calcularMedia()));
            System.out.println("Situação: " + aluno.statusAluno());
            System.out.println("--------------------------");
        }
        
        if (!lista.isEmpty()) {
            double maiorNota = lista.get(0).calcularMaiorNota(lista);
            System.out.println(">>> Maior nota da turma: " + maiorNota);
        }
    }
}
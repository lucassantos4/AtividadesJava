import java.util.ArrayList;

public class Aluno {

    private String nome;
    private double[] notas;

    public Aluno(String nome, double[] notas){
        this.nome = nome;
        this.notas = notas;

    }
    
    public double calcularMedia(){
        if (notas.length == 0 ) return 0;

        double notasTotal = 0;
        for (double nota: notas) {
            notasTotal += nota;
        }

        return notasTotal / notas.length ;
    }

    public double calcularMaiorNota(ArrayList<Aluno> lista) {
        double maiorNota = 0;
        for (Aluno aluno : lista) {
            for (double nota : aluno.getNotas()) {
                if ( nota > maiorNota){
                    maiorNota = nota;
                }
            }
        }

        return maiorNota;
    }

    public String statusAluno(){
        if (this.calcularMedia() < 6) {
            return "reprovado";
        }
        return "aprovado";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

}

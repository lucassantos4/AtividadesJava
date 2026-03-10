public class Titulo implements Comparable<Titulo> {
    String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return getNome();
    }
    @Override
    public int compareTo(Titulo outroTitulo){
        return this.getNome().compareTo(outroTitulo.getNome());
    }


}

public class Animal {

    String nome;
    private int idade;

    public Animal(String nome , int idade){
        this.getNome();
        this.getIdade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazerSom () {
        System.out.println("Fazendo som!!!");
    }
}

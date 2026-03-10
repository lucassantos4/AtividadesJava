public class Cachorro extends Animal{
    String raca;

    public Cachorro(String nome, int idade , String raca){
        super(nome, idade);
        this.getRaca();
    }
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void fazerSom() {
        System.out.println("Au Au Au!!!");
    }
}

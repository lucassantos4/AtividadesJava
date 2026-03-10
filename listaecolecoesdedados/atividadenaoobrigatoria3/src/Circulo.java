public class Circulo implements Forma {
    private double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return  Math.PI * this.raio * this.raio;
    }
}

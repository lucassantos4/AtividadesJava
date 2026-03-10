package obrigatorianaoatividade.calculadoracelaretangular;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double largura;
    private double altura;

    public CalculadoraSalaRetangular(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea(){
        return altura * altura;
    }
    @Override
    public double calcularPerimetro(){
        return 2 * (altura + largura);
    }

    static void main(String[] args) {
        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular(4.50 , 2.30);

        System.out.println("area: " + sala.calcularArea());
        System.out.println("Perimetro: " + sala.calcularPerimetro());
    }
}

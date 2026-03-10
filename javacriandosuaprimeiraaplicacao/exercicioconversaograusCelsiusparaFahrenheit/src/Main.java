public class Main {
    static void main(String[] args) {
        double c = 32.3;
        double f = (c * 1.8) + 32;
        String resultado = String.format("Os graus celcius convertidos para Fahrenheit são %.2f", f);
        System.out.println(resultado);
    }
}

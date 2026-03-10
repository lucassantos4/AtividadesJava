package obrigatorianaoatividade.conversortemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public double celsiusParaFahrenheit(double celsius){
        return (celsius * 9.0 / 5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }

    static void main(String[] args) {

        ConversorTemperaturaPadrao temperatura = new ConversorTemperaturaPadrao();

        System.out.println(temperatura.celsiusParaFahrenheit(0));
        System.out.println(temperatura.fahrenheitParaCelsius(32));

    }
}

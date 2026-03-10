package obrigatorianaoatividade.conversormoedas;

public class ConversorMoeda implements ConversaoFinanceira{

    private  double taxacaombio = 5.0;

    @Override
    public double converterDolarParaReal(double valorDolar) {
        return valorDolar * taxacaombio;
    }
}

package obrigatorianaoatividade.tabuadamultiplicacao;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int numero){
        int resultado = 0;
        for (int i = 1; i < 13; i++) {

            System.out.println(numero + " x " + i + " = " + numero * i );

        }
    }

    static void main() {

        TabuadaMultiplicacao numero = new TabuadaMultiplicacao();
        numero.mostrarTabuada(10);

    }
}

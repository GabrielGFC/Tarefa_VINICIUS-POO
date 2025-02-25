package Calculadora;

public class CalculadoraCientifica extends Calculadora {

    public CalculadoraCientifica(float numero1, float numero2) {
        super(numero1, numero2);
    }

    @Override
    public void calcular() {
        setResultado((float) Math.sin(getNumero1()));
    }

    // Método para calcular o cosseno
    public void calcularCosseno() {
        setResultado((float) Math.cos(getNumero1()));
    }

    // Método para calcular a tangente
    public void calcularTangente() {
        setResultado((float) Math.tan(getNumero1()));
    }

    // Método para calcular o logaritmo natural (ln)
    public void calcularLogaritmo() {
        if (getNumero1() > 0) {
            setResultado((float) Math.log(getNumero1()));
        } else {
            System.out.println("Erro: O logaritmo só pode ser calculado para números positivos.");
        }
    }
}

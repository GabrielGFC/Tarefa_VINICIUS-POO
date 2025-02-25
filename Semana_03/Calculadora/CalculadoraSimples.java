package Calculadora;

public class CalculadoraSimples extends Calculadora {

    public CalculadoraSimples(float numero1, float numero2) {
        super(numero1, numero2);
    }

    @Override
    public void calcular() {
        // Realiza uma operação simples, como soma
        setResultado(getNumero1() + getNumero2());
    }
}

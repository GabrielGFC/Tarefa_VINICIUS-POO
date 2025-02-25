package Calculadora;

public class CalculadoraMAIN {
    public static void main(String[] args) {
        // Testando a Calculadora Simples
        CalculadoraSimples calcSimples = new CalculadoraSimples(5, 3);
        calcSimples.calcular();  // Soma de 5 e 3
        calcSimples.exibirResultado();

        // Testando a Calculadora Científica
        CalculadoraCientifica calcCientifica = new CalculadoraCientifica(1, 0);
        calcCientifica.calcular();
        calcCientifica.exibirResultado();


        calcCientifica.calcularCosseno();
        calcCientifica.exibirResultado();

        calcCientifica.calcularTangente();
        calcCientifica.exibirResultado();

        calcCientifica.calcularLogaritmo();
        calcCientifica.exibirResultado();
    }
}

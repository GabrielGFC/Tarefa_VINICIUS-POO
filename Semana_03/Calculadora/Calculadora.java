package Calculadora;

public abstract class Calculadora {
    private float numero1;
    private float numero2;
    private float resultado;

    // Construtor
    public Calculadora(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Getters e Setters (Encapsulamento)
    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    // Método abstrato para calcular o resultado
    public abstract void calcular();

    // Método para exibir o resultado
    public void exibirResultado() {
        System.out.println("Resultado: " + this.resultado);
    }
}

package assinatura.negocio;

public abstract class Assinatura implements ServicoAssinatura {
    protected String cliente;
    protected int duracaoMeses;

    public Assinatura(String cliente, int duracaoMeses) {
        if (duracaoMeses <= 0) {
            throw new IllegalArgumentException("Duração deve ser positiva");
        }
        this.cliente = cliente;
        this.duracaoMeses = duracaoMeses;
    }

    public String getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + ", Duração: " + duracaoMeses + " meses";
    }
}
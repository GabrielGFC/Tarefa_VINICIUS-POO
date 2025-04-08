package assinatura.negocio;

public class AssinaturaStreaming extends Assinatura {
    private static final double PRECO_BASE = 29.90;
    private static final double PRECO_TELA_EXTRA = 5.00;
    private final int telasExtras;

    public AssinaturaStreaming(String cliente, int duracaoMeses, int telasExtras) {
        super(cliente, duracaoMeses);
        if (telasExtras < 0) {
            throw new IllegalArgumentException("Número de telas extras não pode ser negativo");
        }
        this.telasExtras = telasExtras;
    }

    @Override
    public double calcularMensalidade() {
        return PRECO_BASE + (telasExtras * PRECO_TELA_EXTRA);
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Streaming, Telas extras: " + telasExtras + ", Mensalidade: " + calcularMensalidade();
    }
}
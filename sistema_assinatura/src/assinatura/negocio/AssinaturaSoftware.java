package assinatura.negocio;

public class AssinaturaSoftware extends Assinatura {
    private static final double PRECO_BASE = 49.90;
    private static final double PRECO_MODULO = 10.00;
    private final int modulos;

    public AssinaturaSoftware(String cliente, int duracaoMeses, int modulos) {
        super(cliente, duracaoMeses);
        if (modulos < 0) {
            throw new IllegalArgumentException("Número de módulos não pode ser negativo");
        }
        this.modulos = modulos;
    }

    @Override
    public double calcularMensalidade() {
        return PRECO_BASE + (modulos * PRECO_MODULO);
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Software, Módulos: " + modulos + ", Mensalidade: " + calcularMensalidade();
    }
}
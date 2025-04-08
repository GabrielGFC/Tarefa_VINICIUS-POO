package assinatura.controladora;

import assinatura.dados.AssinaturaRepositorio;
import assinatura.negocio.Assinatura;

import java.util.List;

public class AssinaturaController {
    private final AssinaturaRepositorio repositorio = new AssinaturaRepositorio();

    public void cadastrarAssinatura(Assinatura assinatura) {
        repositorio.adicionarAssinatura(assinatura);
    }

    public List<Assinatura> listarAssinaturas() {
        return repositorio.listarAssinaturas();
    }

    public double calcularValorTotalMensalidade(String cliente) {
        List<Assinatura> assinaturas = repositorio.buscarAssinaturasPorCliente(cliente);
        double total = 0.0;
        for (Assinatura assinatura : assinaturas) {
            total += assinatura.calcularMensalidade();
        }
        return total;
    }
}
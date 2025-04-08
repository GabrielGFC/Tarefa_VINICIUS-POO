package assinatura.dados;

import assinatura.negocio.Assinatura;

import java.util.ArrayList;
import java.util.List;

public class AssinaturaRepositorio {
    private final List<Assinatura> assinaturas = new ArrayList<>();

    public void adicionarAssinatura(Assinatura assinatura) {
        assinaturas.add(assinatura);
    }

    public List<Assinatura> listarAssinaturas() {
        return new ArrayList<>(assinaturas);
    }

    public List<Assinatura> buscarAssinaturasPorCliente(String cliente) {
        List<Assinatura> resultado = new ArrayList<>();
        for (Assinatura assinatura : assinaturas) {
            if (assinatura.getCliente().equalsIgnoreCase(cliente)) {
                resultado.add(assinatura);
            }
        }
        return resultado;
    }
}
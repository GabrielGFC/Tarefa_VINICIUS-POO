package negocio;
import dominio.*;
import dados.Repositorio;

import java.time.LocalDateTime;
import java.util.List;

public class SistemaClinica {
    private Repositorio repo = Repositorio.getInstancia();

    public void cadastrarUsuario(Usuario u) {
        repo.adicionarUsuario(u);
    }

    public void agendarAtendimento(Paciente p, ProfissionalSaude prof, LocalDateTime dataHora) {
        Atendimento a = new Atendimento(p, prof, dataHora);
        repo.adicionarAtendimento(a);
    }

    public void cancelarAtendimento(Atendimento a) {
        a.cancelar();
    }

    public List<Atendimento> listarAtendimentos() {
        return repo.getAtendimentos();
    }
    public void registrarHistorico(Paciente p, String descricao) {
        HistoricoClinico h = buscarHistoricoPaciente(p);
        if (h == null) {
            h = new HistoricoClinico(p);
            repo.adicionarHistorico(h);
        }
        h.adicionarRegistro(descricao);
    }
    public HistoricoClinico buscarHistoricoPaciente(Paciente p) {
        for (HistoricoClinico h : repo.getHistoricos()) {
            if (h.getPaciente().equals(p)) return h;
        }
        return null;
    }
}
package dados;
import dominio.*;
import java.util.*;

public class Repositorio {
    private static Repositorio instancia;
    private List<Usuario> usuarios;
    private List<Atendimento> atendimentos;
    private List<HistoricoClinico> historicos;

    private Repositorio() {
        usuarios = new ArrayList<>();
        atendimentos = new ArrayList<>();
        historicos = new ArrayList<>();
    }
    public static Repositorio getInstancia() {
        if (instancia == null) instancia = new Repositorio();
        return instancia;
    }

    public void adicionarUsuario(Usuario u) { usuarios.add(u); }
    public List<Usuario> getUsuarios() { return usuarios; }

    public void adicionarAtendimento(Atendimento a) { atendimentos.add(a); }
    public List<Atendimento> getAtendimentos() { return atendimentos; }

    public void adicionarHistorico(HistoricoClinico h) { historicos.add(h); }
    public List<HistoricoClinico> getHistoricos() { return historicos; }
}
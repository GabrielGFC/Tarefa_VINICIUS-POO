package dominio;
import java.util.ArrayList;
import java.util.List;

public class HistoricoClinico {
    private Paciente paciente;
    private List<String> registros;

    public HistoricoClinico(Paciente paciente) {
        this.paciente = paciente;
        this.registros = new ArrayList<>();
    }
    public void adicionarRegistro(String registro) {
        registros.add(registro);
    }
    public List<String> getRegistros() { return registros; }
    public Paciente getPaciente() { return paciente; }
}

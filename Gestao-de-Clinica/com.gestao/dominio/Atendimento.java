package dominio;
import java.time.LocalDateTime;

public class Atendimento {
    private Paciente paciente;
    private ProfissionalSaude profissional;
    private LocalDateTime dataHora;
    private boolean cancelado;

    public Atendimento(Paciente paciente, ProfissionalSaude profissional, LocalDateTime dataHora) {
        this.paciente = paciente;
        this.profissional = profissional;
        this.dataHora = dataHora;
        this.cancelado = false;
    }

    public void cancelar() { this.cancelado = true; }

    // Getters
    public Paciente getPaciente() { return paciente; }
    public ProfissionalSaude getProfissional() { return profissional; }
    public LocalDateTime getDataHora() { return dataHora; }
    public boolean isCancelado() { return cancelado; }
}

package dominio;

public class ProfissionalSaude extends Usuario {
    private String especialidade;

    public ProfissionalSaude(String nome, String cpf, String login, String senha, String especialidade) {
        super(nome, cpf, login, senha);
        this.especialidade = especialidade;
    }
    public String getEspecialidade() { return especialidade; }
    @Override
    public String getTipo() { return "ProfissionalSaude"; }
}
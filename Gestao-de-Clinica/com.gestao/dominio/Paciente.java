package dominio;

public class Paciente extends Usuario {
    public Paciente(String nome, String cpf, String login, String senha) {
        super(nome, cpf, login, senha);
    }
    
    @Override
    public String getTipo() { return "Paciente"; }
}
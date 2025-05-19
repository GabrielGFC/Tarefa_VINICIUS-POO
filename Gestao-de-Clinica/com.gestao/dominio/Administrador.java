package dominio;

public class Administrador extends Usuario {
    public Administrador(String nome, String cpf, String login, String senha) {
        super(nome, cpf, login, senha);
    }
    @Override
    public String getTipo() { return "Administrador"; }
}
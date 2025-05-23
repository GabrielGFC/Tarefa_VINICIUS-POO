package dominio;

public abstract class Usuario {
    private String nome;
    private String cpf;
    private String login;
    private String senha;

    public Usuario(String nome, String cpf, String login, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getLogin() { return login; }
    public String getSenha() { return senha; }
    public abstract String getTipo();
}
public abstract class Personagem {
    private String nome;
    private int idade;

    public Personagem(String nome, int idade) {
        this.nome = nome;
        setIdade(idade);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) {
        if (idade < 0) throw new IllegalArgumentException("Idade não pode ser negativa");
        this.idade = idade;
    }

    public abstract void falar();
    public abstract void agir();

    public void comer() {
        System.out.printf("%s está saboreando um prato delicioso!%n", nome);
    }

    @Override
    public String toString() {
        return String.format("%s — idade: %d", nome, idade);
    }
}

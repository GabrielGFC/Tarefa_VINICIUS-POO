public class Remy extends Rato {
    public Remy(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void falar() {
        System.out.printf("%s: “Se você é o que você come, então eu só quero comer coisas boas!”%n", getNome());
    }

    @Override
    public void agir() {
        System.out.printf("%s dirige Linguini na cozinha do Gusteau’s.%n", getNome());
    }
}

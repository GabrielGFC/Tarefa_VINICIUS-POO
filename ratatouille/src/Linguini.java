public class Linguini extends Humano {
    public Linguini(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void falar() {
        System.out.printf("%s: “Desculpe, chefe…”%n", getNome());
    }

    @Override
    public void agir() {
        System.out.printf("%s segue as instruções de Remy na cozinha.%n", getNome());
    }
}

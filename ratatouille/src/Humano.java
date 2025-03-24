public class Humano extends Personagem {
    public Humano(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void falar() {
        System.out.printf("%s fala como um humano.%n", getNome());
    }

    @Override
    public void agir() {
        System.out.printf("%s anda pelas cozinhas de Paris.%n", getNome());
    }
}

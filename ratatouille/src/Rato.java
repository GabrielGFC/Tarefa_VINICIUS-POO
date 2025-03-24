public class Rato extends Personagem {
    public Rato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void falar() {
        System.out.printf("%s faz “squeak!”%n", getNome());
    }

    @Override
    public void agir() {
        System.out.printf("%s corre pelas ruas de Paris.%n", getNome());
    }

    // Sobrecarga
    public void cozinhar() {
        System.out.printf("%s experimenta ingredientes.%n", getNome());
    }
    public void cozinhar(String prato) {
        System.out.printf("%s cozinha %s com maestria.%n", getNome(), prato);
    }
}

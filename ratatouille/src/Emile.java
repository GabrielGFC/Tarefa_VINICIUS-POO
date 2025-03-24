public class Emile extends Rato {
    public Emile(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void falar() {
        System.out.printf("%s: “Comida… gloriosa comida!”%n", getNome());
    }

    @Override
    public void agir() {
        System.out.printf("%s come tudo o que encontra pela frente.%n", getNome());
    }
}

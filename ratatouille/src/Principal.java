public class Principal {
    public static void main(String[] args) {
        Personagem remy     = new Remy("Remy", 2);
        Personagem emile    = new Emile("Emile", 3);
        Personagem linguini = new Linguini("Alfredo Linguini", 19);

        Personagem[] elenco = { remy, emile, linguini };
 
        for (Personagem p : elenco) {
            System.out.printf("%s%n", p);
            p.falar();
            p.agir();
            p.comer();
            if (p instanceof Rato) {
                ((Rato) p).cozinhar("ratatouille");
            }
            System.out.println();
        }
    }
}

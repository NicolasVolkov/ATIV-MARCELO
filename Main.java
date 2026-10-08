package AT03;

public class Main {
    static void main(String[] args) {
        Personagem p1 = new Guerreiro("Jonatas", 23);
        Personagem p2 = new Mago("Túlio", 13);
        p1.exibirStatus();
        p1.atacar();

        p2.exibirStatus();
        p2.atacar();
    }
}

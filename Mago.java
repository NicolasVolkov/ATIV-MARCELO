package AT03;

public class Mago extends Personagem{
    @Override
    public void atacar() {
        System.out.println("Lança feitiço");
    }
    public Mago(String nome, int nivel){
        super(nome, nivel);
    }
}

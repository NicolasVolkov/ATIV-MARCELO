package AT03;

public class Guerreiro extends Personagem{
    @Override
    public void atacar() {
        System.out.println("Golpe de espada");
    }
    public Guerreiro(String nome, int nivel){
        super(nome, nivel);
    }
}

package AT03;

public abstract class Personagem {
    String nome;
    int nivel;
    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }
    public abstract void atacar();
    public void exibirStatus(){
        System.out.println("Nome do personagem: "+ nome);
        System.out.println("Nível: "+ nivel);
    }
}

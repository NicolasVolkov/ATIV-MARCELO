package AT19;

public class Main {
    public static void main(String[] args) {
        Caixa<String> nome = new Caixa<>();
        nome.guardar("Caderno");
        Caixa<Integer> quantidade = new Caixa<>();
        quantidade.guardar(10);
        Caixa<Double> preco = new Caixa<>();
        preco.guardar(25.50);
        System.out.println("Produto: " + nome.obter());
        System.out.println("Quantidade: " + quantidade.obter());
        System.out.println("Preço: R$ " + preco.obter());
    }
}
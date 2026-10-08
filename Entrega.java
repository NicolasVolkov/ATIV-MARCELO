package AT02;

public abstract class Entrega {
    public String tipo(){
        return getClass().getSimpleName();
    }
    String codigoPedido;
    public Entrega(String codigoPedido){
        this.codigoPedido = codigoPedido;
    }
    public abstract double calcularValorFrete();
    public void exibirResumo(){
        System.out.println("Código:" + codigoPedido);
        System.out.println("Valor final do frete: R$"+ calcularValorFrete());
    }
}

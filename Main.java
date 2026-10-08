package AT02;

public class Main {
    static void main(String[] args) {
        Entrega e1 = new EntregaLocal("4567");
        Entrega e2 = new EntregaNacional("3456", 23.3);
        e1.exibirResumo();
        System.out.println(e1.tipo());

        e2.exibirResumo();
        System.out.println(e2.tipo());
    }
}

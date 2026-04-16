package exercicio3;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("João");

        Pedido pedido = new Pedido(cliente);

        ItemPedido item1 = new ItemPedido("Mouse", 50.0, 2);
        ItemPedido item2 = new ItemPedido("Teclado", 120.0, 1);

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        pedido.fecharPedido();
    }
}
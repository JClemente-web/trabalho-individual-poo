package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void fecharPedido() {
        double totalItens = 0.0;

        System.out.println("\n--- RECIBO DO PEDIDO ---");
        System.out.println("Cliente: " + cliente.getNome());

        for (ItemPedido item : itens) {
            double subtotal = item.calcularSubtotal();
            System.out.println(item.getNomeProduto() +
                    " | Qtd: " + item.getQuantidade() +
                    " | Subtotal: R$ " + String.format("%.2f", subtotal));
            totalItens += subtotal;
        }

        double frete;

        if (totalItens >= 250.0) {
            frete = 0.0;
            System.out.println("Frete: GRÁTIS");
        } else {
            frete = 25.0;
            System.out.println("Frete: R$ 25.00");
        }

        double totalGeral = totalItens + frete;

        System.out.println("Total Itens: R$ " + String.format("%.2f", totalItens));
        System.out.println("Total Geral: R$ " + String.format("%.2f", totalGeral));
        System.out.println("------------------------");
    }
}
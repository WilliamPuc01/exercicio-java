package Exercicio25.entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    List<Produto> produtos = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(Cliente cliente) throws Exception {
        if (cliente == null) throw new Exception("Campo pedido nulo");

        this.cliente = cliente;

    }


    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public Double calcularTotal() {
        double sum = 0;
        for (Produto produto : produtos) {
            sum += produto.getPrice();
        }
        return sum;
    }

    public void exibirPedido() {
        System.out.println("--- Dados do Pedido ---");
        System.out.println("Cliente: " + cliente.getName());
        System.out.println("Produtos:");
        for (Produto produto : produtos) {
            System.out.println("- " + produto);
        }
        System.out.println("Valor Total: R$ " + calcularTotal());
        System.out.println("-----------------------");
    }


}

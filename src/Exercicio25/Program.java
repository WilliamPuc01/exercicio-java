package Exercicio25;

import Exercicio25.entities.Cliente;
import Exercicio25.entities.Pedido;
import Exercicio25.entities.Produto;

public class Program {
    public static void main(String[] args) {
        try {

            Produto cafe = new Produto("Café Expresso", 6.50);
            Produto bolo = new Produto("Fatia de Bolo de Chocolate", 12.00);
            Produto pao = new Produto("Pão na Chapa", 5.00);


            Cliente cliente1 = new Cliente("Maria Silva", "1999999-8888");


            Pedido pedido1 = new Pedido(cliente1);
            pedido1.addProduto(cafe);
            pedido1.addProduto(bolo);
            pedido1.addProduto(pao);


            pedido1.exibirPedido();

        } catch (Exception e) {
            System.out.println("Erro ao processar o pedido: " + e.getMessage());
        }
    }
}
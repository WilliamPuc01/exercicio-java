package Exercicio10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        estoque.adicionar(new ProdutoNaoPerecivel("Arroz 5kg", 20, 10, 25.90));
        estoque.adicionar(new ProdutoNaoPerecivel("Detergente", 3, 8, 2.50));
        estoque.adicionar(new ProdutoPerecivel("Leite", 15, 12, 4.80, 4));
        estoque.adicionar(new ProdutoPerecivel("Iogurte", 30, 10, 3.20, 20));

        System.out.println("=== Todos os produtos ===");
        estoque.listarTodos();

        System.out.println("\n=== Produtos para repor (abaixo do mínimo) ===");
        List<Produto> repor = estoque.produtosParaRepor();
        for (Produto p : repor) {
            System.out.println(p.getNome());
        }

        System.out.println("\n=== Produtos críticos ===");
        for (Produto p : estoque.produtosCriticos()) {
            System.out.println(p.getNome());
        }

        System.out.println("\n=== Ordenado por urgência ===");
        estoque.ordenarPorUrgencia();
        estoque.listarTodos();

        System.out.printf("%n=== Valor total do estoque: R$ %.2f ===%n",
                estoque.calcularValorTotal());
    }
}
package Exercicio10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Estoque {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionar(Produto p){ this.produtos.add(p);}

    public List<Produto> produtosParaRepor(){
        List<Produto> resultado = new ArrayList<>();

        for(Produto p : produtos){
            if(p.abaixoDoMinimo()){
                resultado.add(p);
            }
        }
        return resultado;
    }

    public List<Produto> produtosCriticos(){
        List<Produto> resultado = new ArrayList<>();

        for(Produto p: produtos){
            if(p.estaCritico()){
                resultado.add(p);
            }
        }
        return resultado;
    }

    public void ordenarPorUrgencia() {
        produtos.sort(
                Comparator.comparing(Produto::estaCritico).reversed()
                        .thenComparingInt(this::diasRestantes)
        );
    }
    private int diasRestantes(Produto p) {
        if (p instanceof ProdutoPerecivel) {
            return ((ProdutoPerecivel) p).getDiasParaVencer();
        }
        return Integer.MAX_VALUE;
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getQuantidade() * p.getPreco();
        }
        return total;
    }

    public void listarTodos() {
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}

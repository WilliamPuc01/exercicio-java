package Exercicio10;

public abstract class Produto {
    private String nome;
    private int quantidade;
    private int quantidadeMinima;
    private double preco;

    Produto(String nome, int quantidade, int quantidadeMinima, double preco){
       super();
        this.nome = nome;
        this.quantidade = quantidade;
        this.quantidadeMinima = quantidadeMinima;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public int getQuantidadeMinima(){
        return this.quantidadeMinima;
    }

    public double getPreco() {
        return preco;
    }

    public boolean abaixoDoMinimo(){
        return this.quantidade < this.quantidadeMinima;
    }

    public abstract boolean estaCritico();

    @Override
    public String toString() {
        return nome + " | qtd: " + quantidade + " (mín: " + quantidadeMinima
                + ") | R$ " + preco + (estaCritico() ? " [CRÍTICO]" : "");
    }
}

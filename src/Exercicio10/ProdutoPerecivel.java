package Exercicio10;

public class ProdutoPerecivel extends Produto {
    private int diasParaVencer;

    public ProdutoPerecivel(String nome, int quantidade, int quantidadeMinima,
                            double preco, int diasParaVencer) {
        super(nome, quantidade, quantidadeMinima, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    @Override
    public boolean estaCritico() {
        return abaixoDoMinimo() || diasParaVencer < 7;
    }
}
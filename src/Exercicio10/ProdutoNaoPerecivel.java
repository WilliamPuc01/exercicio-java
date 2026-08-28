package Exercicio10;

public class ProdutoNaoPerecivel extends Produto{

    public ProdutoNaoPerecivel(String nome, int quantidade, int quantidadeMinima, double preco) {
        super(nome, quantidade, quantidadeMinima, preco);
    }
        @Override
        public boolean estaCritico() {
            return abaixoDoMinimo();
        }
}


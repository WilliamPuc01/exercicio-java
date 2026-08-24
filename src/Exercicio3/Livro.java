package Exercicio3;

public class Livro {
    private static final int LIMITE_ALUGUEL = 5;

    private final String titulo;
    private final String autor;
    private int quantidadeAlugada;

    public Livro(String titulo, String autor) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("O título não pode ser vazio");
        }
        if (autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("O autor não pode ser vazio");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeAlugada = 0;
    }

    public void alugar(int qtd) {
        if (qtd <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser positiva");
        }
        if (quantidadeAlugada + qtd > LIMITE_ALUGUEL) {
            throw new IllegalStateException(
                    "Não é possível alugar mais que " + LIMITE_ALUGUEL + " unidades deste livro");
        }
        quantidadeAlugada += qtd;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getQuantidadeAlugada() {
        return quantidadeAlugada;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | Autor: " + autor + " | Alugados: " + quantidadeAlugada;
    }
}
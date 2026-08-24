package Exercicio3;

public class Livro {
    public String titulo;
    public String autor;
    public static int Totalalugado = 0;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }


    public void alugar(int qtd)throws Exception{
        if(qtd <= 0)throw new Exception("O valor não pode ser zero ou negativo");

        if( qtd > 5){
            System.out.println("Não pode alugar mais que 5 livros");
        }else{
            Totalalugado += qtd;
        }
    }

    public String toString(){
        return "Titulo: " + titulo + "  Autor: " + autor + "  Total Alugado: " + Totalalugado;
    }



}

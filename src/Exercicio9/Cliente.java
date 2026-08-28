package Exercicio9;

public class Cliente {
    private String nome;
    private Prioridade prioridade;
    private int ordemChegada;

    Cliente(String nome, Prioridade prioridade, int ordemChegada){
         this.nome = nome;
         this.prioridade = prioridade;
         this.ordemChegada = ordemChegada;
    }

    public String getNome(){
        return this.nome;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public int getOrdemChegada(){
        return this.ordemChegada;
    }

}

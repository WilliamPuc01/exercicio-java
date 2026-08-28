package Exercicio9;

public enum Prioridade {

    URGENTE(1), PREFERENCIAL(2), NORMAL(3);
    public int peso;

    Prioridade(int peso){
        this.peso = peso;
    }

    public int getPeso(){
        return this.peso;
    }
}

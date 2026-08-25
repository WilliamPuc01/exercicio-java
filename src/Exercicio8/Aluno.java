package Exercicio8;

/*
* Treinando encapsulamento e fazendo algoritmo envolvendo lista e percorrendo a lita, para descobir a media dos alunos.
* */

public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getNota(){
        return this.nota;
    }
    public void setNota(double nota){
        this.nota = nota;
    }

}

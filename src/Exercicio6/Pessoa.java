package Exercicio6;

public class Pessoa {
    private double altura;
    private char sexo;

    public Pessoa(double altura, char sexo){
        this.altura = altura;
        this.sexo = Character.toUpperCase(sexo);
    }

    public double getAltura(){
        return altura;
    }
    public char getSexo(){
        return sexo;
    }
}

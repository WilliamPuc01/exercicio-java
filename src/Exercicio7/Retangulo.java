package Exercicio7;

/*
* Treinando o encapsulamento, fazendo com que os atributos não estejam em publico.
* Dessa forma, podendo acessar através dos metódos get e set
* */

public class Retangulo {
    private double base;
    private double altura;


    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double area(){
        return this.base * this.altura;
    }

    public double perimetro(){
        return (2.0*this.base)+ (2.0*this.altura);
    }

    public double getBase(){
        return this.base;
    }
    public void setBase(double base){
        this.base = base;
    }

    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }


}

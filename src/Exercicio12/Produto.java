package Exercicio12;

public class Produto {
    private String name;
    private double price;

    public Produto(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "Nome: " + this.name + "  Preço: " + this.price;
    }
}

package Exercicio23.entities;

import Exercicio23.entities.enums.Color;

public class Rectangle extends  Shape{

    private Double width;
    private Double height;

    public Rectangle(){
        super();
    }

    public Rectangle(Color color, Double width, Double height){
        super(color);
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }
}

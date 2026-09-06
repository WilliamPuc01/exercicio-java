package Exercicio17.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;
    Product product;

    public OrderItem(){}

    public OrderItem(Integer quantity, Double price, Product product){
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public double subTotal(){
        return this.price * this.price;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return getProduct().getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}

public class Product {

    public String name;
    public double price;
    public int estoque;

    public double TotalValueStock(){
        double total = price * estoque;
        return total;
    }


}

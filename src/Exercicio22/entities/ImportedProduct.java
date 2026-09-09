package Exercicio22.entities;

public class ImportedProduct extends Product{
    private Double customFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customFee){
        super(name, price);
        this.customFee = customFee;
    }

    @Override
    public String priceTag(){
        return getName() + " $ " + totalPrice() + " (Customs fee: $" + this.customFee + ")";
    }

    public Double totalPrice(){
        return getPrice() + this.customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }
}

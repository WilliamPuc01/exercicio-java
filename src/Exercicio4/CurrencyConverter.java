package Exercicio4;

public class CurrencyConverter {
    public double dolar = 3.10;
    public double iof = 60.00;


    public double Conversao(double buyDolar){
        return this.dolar * buyDolar * (1+ this.iof/ 100);

    }

}

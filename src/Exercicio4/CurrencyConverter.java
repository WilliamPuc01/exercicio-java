package Exercicio4;

public class CurrencyConverter {
    private static final double IOF_PERCENTUAL = 60.00;

    private final double cotacaoDolar;

    public CurrencyConverter(double cotacaoDolar) {
        if (cotacaoDolar <= 0) {
            throw new IllegalArgumentException("A cotação do dólar deve ser positiva");
        }
        this.cotacaoDolar = cotacaoDolar;
    }

    public double converter(double valorEmDolar) {
        if (valorEmDolar < 0) {
            throw new IllegalArgumentException("O valor a converter não pode ser negativo");
        }
        return valorEmDolar * cotacaoDolar * (1 + IOF_PERCENTUAL / 100);
    }

    public double getCotacaoDolar() {
        return cotacaoDolar;
    }
}
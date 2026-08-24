package Exercicio5;

public class Temperatura {
    private double celsius;
    private double fahrenheit;


    public Temperatura(double celsius, double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public double converterCelsiusParaFahrenheit() {
        return (this.celsius * 1.8) + 32.0;
    }

    public double converterFahrenheitParaCelsius() {
        return (this.fahrenheit - 32.0) * (5.0 / 9.0);
    }

    public double converterCelsiusParaKelvin() {
        return this.celsius + 273.15;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }
}
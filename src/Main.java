import java.util.Locale;
import java.util.Scanner;
import Exercicio5.Temperatura;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em Celsius: ");
        double celsius = sc.nextDouble();

        System.out.print("Digite o valor em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Instancia o objeto passando os dois valores
        Temperatura temperatura = new Temperatura(celsius, fahrenheit);

        // Os métodos agora leem os atributos internos do objeto
        System.out.printf("Celsius (%.2f°C) em Fahrenheit: %.2f°F%n",
                temperatura.getCelsius(), temperatura.converterCelsiusParaFahrenheit());

        System.out.printf("Fahrenheit (%.2f°F) em Celsius: %.2f°C%n",
                temperatura.getFahrenheit(), temperatura.converterFahrenheitParaCelsius());

        System.out.printf("Celsius (%.2f°C) em Kelvin: %.2f K%n",
                temperatura.getCelsius(), temperatura.converterCelsiusParaKelvin());

        sc.close();
    }
}
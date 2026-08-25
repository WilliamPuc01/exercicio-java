import java.util.Locale;
import java.util.Scanner;
import Exercicio5.Temperatura;
import Exercicio6.Grupo;
import Exercicio6.Pessoa;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
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
*/

        Grupo grupo = new Grupo();

        grupo.adicionarPessoa(new Pessoa(1.75, 'M'));
        grupo.adicionarPessoa(new Pessoa(1.80, 'M'));
        grupo.adicionarPessoa(new Pessoa(1.68, 'F'));
        grupo.adicionarPessoa(new Pessoa(1.90, 'M'));
        grupo.adicionarPessoa(new Pessoa(1.55, 'F'));
        grupo.adicionarPessoa(new Pessoa(1.72, 'F'));
        grupo.adicionarPessoa(new Pessoa(1.85, 'M'));
        grupo.adicionarPessoa(new Pessoa(1.60, 'F'));
        grupo.adicionarPessoa(new Pessoa(1.77, 'M'));
        grupo.adicionarPessoa(new Pessoa(1.65, 'F'));

        System.out.printf("Maior altura: %.2f m%n", grupo.getMaiorAltura());
        System.out.printf("Menor altura: %.2f m%n", grupo.getMenorAltura());
        System.out.printf("Média de altura dos homens: %.2f m%n", grupo.calcularMediaAlturaHomens());
        System.out.printf("Média de altura das mulheres: %.2f m%n", grupo.calcularMediaAlturaMulheres());

        sc.close();
    }
}
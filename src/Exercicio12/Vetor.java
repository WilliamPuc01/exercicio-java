package Exercicio12;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

//Trabalhando com vetores
public class Vetor {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
        Produto[] vect = new Produto[n];

        for(int i = 0; i < n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] = new Produto(name, price);
        }

        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum/n;

        System.out.println(Arrays.toString(vect));
        System.out.println(avg);


        sc.close();
    }
}

package Exercicio13;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class testePensionato {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(in);

        Pensionato[] rooms = new Pensionato[9];



        System.out.println("Deseja alugar quantos quarto? ");
        int numeroQuarto = sc.nextInt();

        for(int i = 0 ; i < numeroQuarto; i++){
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();

            System.out.println("Numero do quarto: ");
            int numQuarto = sc.nextInt();


            rooms[numQuarto] = new Pensionato(nome, email, numQuarto);




        }

        System.out.println(Arrays.toString(rooms));

        sc.close();





    }
}

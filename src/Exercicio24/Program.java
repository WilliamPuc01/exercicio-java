package Exercicio24;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
            e.printStackTrace();  //faz o tracking do erro em qual classe esta sendo o erro.
        }
        catch (InputMismatchException e){
            System.out.println("Input error");
        }
        finally {

        }// é um bloco que vai ser executado independentemente da exceção ou não

        System.out.print("End of program");

        sc.close();
    }
}

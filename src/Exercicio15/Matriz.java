package Exercicio15;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

//Revisando sobre matrizes

public class Matriz {
    public static void main(String[] args){

        Scanner sc = new Scanner(in);

        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        //declarando a matriz
        int[][] mat = new int[n][n];

      //preenchendo a matriz
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }


        System.out.println("Main diagonal: ");

        for(int i = 0; i < n; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int cont = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j< n; j++){
                if(mat[i][j] < 0){
                    cont++;
                }
            }
        }

        System.out.println("Numeros negativos: " + cont);


        sc.close();

    }
}

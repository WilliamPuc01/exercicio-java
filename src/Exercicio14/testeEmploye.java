package Exercicio14;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class testeEmploye {
    public static void main(String[] args){


        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(in);

        List<Employe> list = new ArrayList<>();

        System.out.println("Quantos funcionarios voce deseja registrar?");

        double n = sc.nextInt();

        for(int i = 0; i < n; i++){

            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double salary = sc.nextDouble();

            list.add(new Employe(id, name, salary));
        }

        System.out.println(list);

        System.out.println("Digite o id do funcionario que deseja aumentar o salario: ");

        sc.nextLine();
        int id = sc.nextInt();
        List<Employe> result = list.stream().filter(x -> x.getId() == id).toList();

        System.out.println("Quantos porcento? ");
        double percent = sc.nextDouble();
        result.add(Employe());








        sc.close();


    }
}

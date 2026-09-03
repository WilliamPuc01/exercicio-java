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

        System.out.print("Quantos funcionarios voce deseja registrar? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("\nFuncionario #" + (i + 1) + ":");

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consome a quebra de linha do int

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Salario: ");
            double salary = sc.nextDouble();

            list.add(new Employe(id, name, salary));
        }

        System.out.println("\nLista de cadastrados:");
        for(Employe p : list){
            System.out.println(p);
        }

        System.out.print("\nDigite o id do funcionario que deseja aumentar o salario: ");
        int id = sc.nextInt();

        // Busca a posição (índice) na lista usando o método auxiliar
        Integer pos = position(list, id);

        if(pos == null){
            System.out.println("Esse usuario nao existe!");
        } else {
            System.out.print("Quantos porcento? ");
            double percent = sc.nextDouble();

            // Acessa o elemento da lista pelo índice encontrado
            list.get(pos).salaryGrowth(percent);
        }

        System.out.println("\nLista atualizada:");
        for(Employe p : list){
            System.out.println(p);
        }

        sc.close();
    }

    public static Integer position(List<Employe> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
package Exercicio21;

import Exercicio21.entities.Employee;
import Exercicio21.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Program {
    public static void main(String[] args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);


        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++){
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n) ?");
            char Outsourced = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value Per Hour: ");
            Double valuePerHour = sc.nextDouble();
            if(Outsourced == 'y'){

                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge)) ;

            }else{
                employees.add(new Employee(name, hours, valuePerHour));
            }


        }

        System.out.println();
        System.out.println("PAYMENTS:");

        for( Employee e: employees){
            System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
        }


        sc.close();

    }
}

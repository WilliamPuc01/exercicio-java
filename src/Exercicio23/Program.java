package Exercicio23;

import Exercicio23.entities.Circle;
import Exercicio23.entities.Rectangle;
import Exercicio23.entities.Shape;
import Exercicio23.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1 ; i <= n; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.nextLine().toLowerCase().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if(ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                sc.nextLine();
                list.add(new Rectangle(color, width, height));
            }
            else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                sc.nextLine();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println("SHAPE AREAS: ");

        for(Shape sh : list){
            System.out.println(String.format("%.2f", sh.area()));
        }

        sc.close();
    }
}

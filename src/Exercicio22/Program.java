package Exercicio22;

import Exercicio22.entities.ImportedProduct;
import Exercicio22.entities.Product;
import Exercicio22.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.System.in;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=1; i <= n; i++){
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i) ? ");
            char x = sc.nextLine().toLowerCase().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            sc.nextLine();

            if(x == 'i'){
                System.out.print("Custom fee: ");
                Double customFee = sc.nextDouble();
                sc.nextLine();
                products.add(new ImportedProduct(name, price, customFee));
            }
            else if( x == 'u'){
                System.out.print("Manufacture date ( DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                products.add(new UsedProduct(name, price, date));

            }else{

                products.add(new Product(name, price));

            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");


        for(Product p: products){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}

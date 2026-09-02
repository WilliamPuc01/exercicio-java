package Exercicio14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConhecimentoLista {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Joao");
        list.add("Marcia");
        list.add("William");
        list.add("Willy");
        list.add("Danielle");


        System.out.println(list.size());
        list.add(2, "Pedro");

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("------------------------");
        list.removeIf( x -> x.charAt(0) == 'M');

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("------------------------");
        System.out.println("Index of William: " + list.indexOf("William"));

        System.out.println("------------------------");
        List<String> result = list.stream().filter( x -> x.charAt(0) == 'W').toList();
        for(String x : result){
            System.out.println(x);
        }


    }
}

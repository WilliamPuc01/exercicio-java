package Exercicio6;

import java.util.ArrayList;
import java.util.List;

/*
2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
*  */

public class Grupo {
    private List<Pessoa> pessoas;

    public Grupo(){
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa){
        this.pessoas.add(pessoa);
    }

    public double getMaiorAltura(){
        double maior = pessoas.get(0).getAltura();

        for(Pessoa p: pessoas){
            if(p.getAltura() > maior){
                maior = p.getAltura();
            }
        }
        return maior;
    }

    public double getMenorAltura(){
        double menor = pessoas.get(0).getAltura();

        for(Pessoa p: pessoas){
            if(p.getAltura() < menor){
                menor = p.getAltura();
            }
        }
        return menor;
    }


    public double calcularMediaAlturaHomens(){
        double somaAlturas = 0.00;
        int contMan = 0;

        for(Pessoa p: pessoas){
            if(p.getSexo() == 'M'){
                somaAlturas += p.getAltura();
                contMan++;
            }
        }
        return  (contMan > 0) ? (somaAlturas/contMan): 0.0;
    }

    public double calcularMediaAlturaMulheres(){
        double somaAlturas = 0.00;
        int contFemale = 0;

        for(Pessoa p: pessoas){
            if(p.getSexo() == 'F'){
                somaAlturas += p.getAltura();
                contFemale++;
            }
        }
        return  (contFemale > 0) ? (somaAlturas/contFemale): 0.0;
    }




}

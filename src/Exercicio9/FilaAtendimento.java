package Exercicio9;

import java.util.ArrayList;
import java.util.List;

public class FilaAtendimento {
    private List<Cliente> clientes = new ArrayList<>();
    private  int contadorChegada;

    public void adicionar(Cliente c) {
        int i = 0;
        while (i < clientes.size() && devePassarNaFrente(clientes.get(i), c)) {
            i++;
        }
        clientes.add(i, c);
    }
    private boolean devePassarNaFrente(Cliente daFila, Cliente novo) {
        if (daFila.getPrioridade().getPeso() < novo.getPrioridade().getPeso()) {
            return true;
        }

        if (daFila.getPrioridade().getPeso() == novo.getPrioridade().getPeso()) {
            return daFila.getOrdemChegada() < novo.getOrdemChegada();
        }
        return false;
    }

    public void listarFila(){
        int cont = 0;
        for(Cliente c: clientes){

            System.out.println("Fila: " +clientes.get(cont));
            cont++;
        }
    }
    public Cliente chamarProximo() {
        if (estaVazia()) return null; // ou lançar exceção
        return clientes.remove(0);
    }

    public int tamanho(){
        return clientes.size();
    }

    public boolean estaVazia() {
        return clientes.isEmpty();
    }


}

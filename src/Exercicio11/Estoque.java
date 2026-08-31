package Exercicio11;


import java.util.HashMap;
import java.util.Map;


public class Estoque {
    private Map<Medicamento, Integer> medicamentos = new HashMap<>();



    public void adicionarItem(Medicamento medicamento, int quantidade){
        this.medicamentos.merge(medicamento, quantidade, Integer::sum);
    }

    public void removerItem(Medicamento medicamento, int quantidade){
        this.medicamentos.computeIfPresent(medicamento, (med, atual) -> {
            int nova = atual - quantidade;
            return nova > 0 ? nova : null; // null remove a entrada quando zera
        });
    }

    public int consultarQuantidade(Medicamento medicamento){
        return this.medicamentos.getOrDefault(medicamento, 0);
    }

    public Map<Medicamento, Integer> getMedicamentos(){
        return medicamentos;
    }

}

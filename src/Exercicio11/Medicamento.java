package Exercicio11;

import java.time.LocalDate;
import java.util.Date;

public class Medicamento {
    private int id;
    private String nome;
    private String principioAtivo;
    private double preco;
    private boolean requerReceita;
    private LocalDate dataValidade;
    private String lote;


    Medicamento(int id, String nome, String principioAtivo, double preco, boolean requerReceita, LocalDate dataValidade, String lote){
        this.id = id;
        this.nome = nome;
        this.principioAtivo = principioAtivo;
        this.preco = preco;
        this.requerReceita = requerReceita;
        this.dataValidade = dataValidade;
        this.lote = lote;
    }

    public void atualizarPreco(double novoPreco){
        this.preco = novoPreco;
    }

    public boolean isVencido(){
        LocalDate hoje = LocalDate.now();
        return hoje.isAfter(this.dataValidade);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getId() {
        return id;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public boolean isRequerReceita() {
        return requerReceita;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public String getLote() {
        return lote;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public void setRequerReceita(boolean requerReceita) {
        this.requerReceita = requerReceita;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
}

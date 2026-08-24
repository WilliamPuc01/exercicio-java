package Exercicio1;

public class ContaBancaria {
    private final String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("O titular não pode ser vazio");
        }
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser positivo");
        }
        if (valor > this.saldo) {
            throw new IllegalStateException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
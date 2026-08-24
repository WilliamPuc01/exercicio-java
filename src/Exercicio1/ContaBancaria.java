package Exercicio1;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) throws Exception{
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Deposito realizado");
        }else{
            System.out.println("Deu erro");
        }
    }

    public void sacar(double valor) throws Exception{
        if(this.saldo < valor)throw new Exception("Valor errado");
    }


}

package Exercicio20.entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance;


    public Account(){}

    public Account(Integer number, String holder, Double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public void withdraw(double amount){
        balance -= amount + 5;
    };

    public void deposit(Double amount){
        balance += amount;
    }


    public Double getBalance() {
        return balance;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


}

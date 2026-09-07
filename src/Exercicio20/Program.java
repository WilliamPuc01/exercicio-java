package Exercicio20;

import Exercicio20.entities.Account;
import Exercicio20.entities.BusinessAccount;
import Exercicio20.entities.SavingsAccount;

public class Program {
    public static void main(String[] args){

        Account acc = new Account(1001, "Alex", 1000.0);
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        Account accS = new SavingsAccount(1100, "Mary", 1000.0, 0.01);
        accS.withdraw(200.0);
        System.out.println(accS.getBalance());


        Account accB = new BusinessAccount(1200, "William", 1000.00, 200.00);
        accB.withdraw(200.00);
        System.out.println(accB.getBalance());




        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3;

        //erifica se um objeto é uma instância de uma classe específica
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}

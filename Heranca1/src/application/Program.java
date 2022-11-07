package application;


import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(2565, "Laiane", 8999.25);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
        System.out.println(acc.getBalance());
        System.out.println(acc);

        //UPCASTING

        Account acc1 = bacc;
        System.out.println(acc1.getBalance());

        Account acc2 = new BusinessAccount(1003, "Barbalho", 0.0, 200.00);

        Account acc3 = new SavingsAccount(1004, "Bena", 0.0, 0.01);

        // downcasting


        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);

        //BusinessAccount acc5 = (BusinessAccount) acc3;
        if(acc3 instanceof  BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("update!");
        }

        // sobreposicao OVERRIDE
        Account acc6 = new Account(1008, "Iracema", 1000.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(5050, "Mark", 1000.0, 0.01);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());

        // SUPER

        Account acc8 = new BusinessAccount(1050, "Bob", 1000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());

        // POLIMORFISMO

        Account x = new Account(1000, "Mourao", 1000.0);
        Account y = new SavingsAccount(2001, "Mary", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }
}

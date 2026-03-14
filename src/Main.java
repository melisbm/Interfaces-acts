
import Level2.BankingSystem.*;

public class Main {
    public static void main(String[] args){

        CurrentAccount curr = new CurrentAccount(123);
        SavingsAccount save = new SavingsAccount(60);

        curr.viewBalance();
        save.viewBalance();
        System.out.println("-------------");
        curr.deposit(120);
        curr.viewBalance();
        System.out.println("-------------");
        curr.withdraw(save, 58);
        curr.viewBalance();
        save.viewBalance();
        System.out.println("-------------");
        System.out.println(curr.calculateInterest(25));
        System.out.println(save.calculateInterest(30));

    }
}

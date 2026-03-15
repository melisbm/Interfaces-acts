
import Level2.BankingSystem.*;

public class Main {
    public static void main(String[] args){

        CurrentAccount curr = new CurrentAccount();
        curr.deposit(100);
        curr.viewBalance();

    }
}
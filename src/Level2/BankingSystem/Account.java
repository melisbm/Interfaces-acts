package Level2.BankingSystem;

public interface Account {
    public void deposit(double amount);
    public void withdraw(Account account, double amount);

    public double calculateInterest(double percentile);
    public void viewBalance();

}

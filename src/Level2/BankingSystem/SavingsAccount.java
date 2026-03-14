package Level2.BankingSystem;

public class SavingsAccount implements Account{

    private double balance = 0;

    public SavingsAccount(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Amount can not be less or equal to 0.");
        }
        balance = amount;
    }

    @Override
    public void deposit(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Amount can not be less or equal to 0.");
        }

        balance += amount;
    }

    @Override
    public void withdraw(Account account, double amount){

        if(this.getBalance() < amount){
            throw new IllegalArgumentException();
        }

        account.deposit(amount);
        this.balance -= amount;
    }

    @Override
    public double calculateInterest(double percentile){
        return balance * percentile / 100;
    }

    @Override
    public void viewBalance(){
        System.out.println(balance);
    }

    public double getBalance(){
        return balance;
    }

}

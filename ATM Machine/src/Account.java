public class Account {

    private String accountTitle;
    private double balance;
    // Constructors
    public Account(String accountTitle) {
        this.accountTitle = accountTitle;
        this.balance = 500;
    }
    public Account(String accountTitle, double balance) {
        this.accountTitle = accountTitle;
        this.balance = balance;
    }
    // Getter
    public String getAccountTitle() {
        return accountTitle;
    }
    public double getBalance() {
        return balance;
    }
    // Print Balance
    public void printBalance() {
        System.out.println("The balance is: $" + balance);
    }
    // Deposit
    public void deposit(double amount){
        if (amount > 0 )
            this.balance = this.balance + amount;
    }
    // Withdraw balance
    public void withdrawBalance(double amount){
        this.balance = this.balance - amount;
    }
}

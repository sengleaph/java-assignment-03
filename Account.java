package Banking;

public interface Account {
    public void withdraw(double amount);
    public double deposit(double amount);
    public double checkBalance ();
    public double calculateInterest();
}

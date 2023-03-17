package Banking;

public class SavingAccount implements Account {
    double balance;
    float interstRates;

    SavingAccount(){
        balance = 0;
        interstRates = 50;

    }

    @Override
    public void withdraw(double amount ) {
        if (amount <= balance){
            balance -= amount;
        }else {
            System.out.println("Insufficient balance!!!");
        }
    }

    @Override
    public double deposit(double amount) {
        balance += amount;
        return amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public double calculateInterest() {
        return (balance * (interstRates/100));
    }
}

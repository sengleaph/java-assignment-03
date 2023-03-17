package Banking;

public class ResultOfMain {
    public static void main(String[] args) {
        BankingServiceII creditAccount = new BankingServiceII(new CreditcardAccount());
        creditAccount.deposit(10000);
        System.out.println("Credit Balance:  " +creditAccount.showBalance()+"$");


        BankingServiceII savingAccount = new BankingServiceII(new SavingAccount());
        savingAccount.deposit(500);
        System.out.println("Saving Balance: "+savingAccount.showBalance()+"$");
    }
}

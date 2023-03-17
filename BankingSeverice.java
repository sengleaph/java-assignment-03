package Banking;

public class BankingSeverice {
    SavingAccount savingAccount;
    CreditcardAccount creditcardAccount;
    BankingSeverice(){
        savingAccount = new SavingAccount();
        creditcardAccount = new CreditcardAccount();
    }
    BankingSeverice(SavingAccount savingAccount, CreditcardAccount creditcardAccount){
        this.savingAccount = savingAccount;
        this.creditcardAccount = creditcardAccount;
    }
    double showBalance (){
        return savingAccount.checkBalance();
    }
    double showCreditCardBalance(double amount){
        return creditcardAccount.deposit(amount);

    }
    void addMoney(double amount){
        savingAccount.deposit(amount);
    }
    void withDrawMoney(double amount){
        savingAccount.withdraw(amount);
    }

}

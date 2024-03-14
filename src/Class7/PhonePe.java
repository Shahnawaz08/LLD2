package Class7;

public class PhonePe {
    private BankAPIAdapter bankAPI;
    public PhonePe(BankAPIAdapter bankAPI) {
        this.bankAPI = bankAPI;
    }
    double doSomething(String accountNumber) throws InterruptedException {
        double balance = bankAPI.getBalance(accountNumber);
        Thread.sleep(25*24*60*60*100);
        return balance;
    }

}

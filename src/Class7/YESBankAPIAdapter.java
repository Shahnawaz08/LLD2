package Class7;

import Class7.thirdParty.yesbank.YesBankAPI;

public class YESBankAPIAdapter implements BankAPIAdapter{

    private YesBankAPI yesBankAPI=new YesBankAPI();
    @Override
    public double getBalance(String accountNumber) {
        String balance=yesBankAPI.getBalance(accountNumber);
        double doubleBalance=Double.parseDouble(balance);
        return doubleBalance;

//        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}

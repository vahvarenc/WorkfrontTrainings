package homeworks.HW2;

/**
 * Created by Vahag on 3/30/2017.
 */
public class SavingsAccount extends BankAccount {
    private boolean isActive;


    public SavingsAccount(double balance, double annualInterestRate) {
        super(balance, annualInterestRate);
        if (balance > 25){
            isActive = true;
        }

    }

    @Override
    public void withdrawal(double withdrawal) {
        if (isActive) {
            super.withdrawal(withdrawal);
        }
    }

    @Override
    public void deposit(double deposit) {
        if (!isActive) {
            super.deposit(deposit);
            if (getBalance() > 25) {
                isActive = true;
            }
        }
    }

    @Override
    public void monthlyProcess() {
        if (getNumberOfWithdrawals() > 4) {
            setMonthlyServiceCharges(getMonthlyServiceCharges() + 1);
        }
        super.monthlyProcess();
        if (getBalance() < 25) {
            isActive = false;
        }
    }
}

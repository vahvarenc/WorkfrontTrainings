package homeworks.HW2;

/**
 * Created by Vahag on 3/30/2017.
 */
public abstract class BankAccount {
    private double balance;
    private int numberOfDepositsThisMonth;
    private int numberOfWithdrawals;
    private double annualInterestRate;
    private double monthlyServiceCharges;

    public BankAccount(double balance, double annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void deposit(double deposit){
        balance += deposit;
        numberOfDepositsThisMonth++;
    }

    public void withdrawal(double withdrawal){
        balance -= withdrawal;
        numberOfWithdrawals++;
    }

    public void calcInterest(){
        balance += balance*annualInterestRate/12;
    }

    public void monthlyProcess(){
        balance -= monthlyServiceCharges;
        calcInterest();
        numberOfWithdrawals = 0;
        numberOfDepositsThisMonth = 0;
        monthlyServiceCharges = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumberOfDepositsThisMonth() {
        return numberOfDepositsThisMonth;
    }

    public void setNumberOfDepositsThisMonth(int numberOfDepositsThisMonth) {
        this.numberOfDepositsThisMonth = numberOfDepositsThisMonth;
    }

    public int getNumberOfWithdrawals() {
        return numberOfWithdrawals;
    }

    public void setNumberOfWithdrawals(int numberOfWithdrawals) {
        this.numberOfWithdrawals = numberOfWithdrawals;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyServiceCharges() {
        return monthlyServiceCharges;
    }

    public void setMonthlyServiceCharges(double monthlyServiceCharges) {
        this.monthlyServiceCharges = monthlyServiceCharges;
    }
}


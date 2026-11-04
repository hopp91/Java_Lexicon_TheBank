// Checking account
class CheckingAccount extends Account {
    private double monthlyFee;

    public CheckingAccount(String holder, double balance, double monthlyFee) {
        super(holder, balance);
        this.monthlyFee = monthlyFee;
    }

    @Override
    public void processMonth() {
        setBalance(getBalance() - monthlyFee);
        IO.println(getHolder() + ": monthly fee charged");
    }
}
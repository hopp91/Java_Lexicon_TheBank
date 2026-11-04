// Loan account
class LoanAccount extends Account {
    private double loanRate;

    public LoanAccount(String holder, double balance, double loanRate) {
        super(holder, balance);
        this.loanRate = loanRate;
    }

    @Override
    public void processMonth() {
        setBalance(getBalance() + getBalance() * loanRate);
        IO.println(getHolder() + ": loan interest added");
    }
}
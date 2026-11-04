public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("My Bank");

        bank.addAccount(
                new SavingsAccount("Alice", 10000, 0.02)
        );

        bank.addAccount(
                new CheckingAccount("Bob", 5000, 50)
        );

        bank.addAccount(
                new LoanAccount("Charlie", 20000, 0.05)
        );

        IO.println("Before monthly processing:");
        bank.printAllSummaries();

        IO.println("\nProcessing all accounts:");
        bank.processAllAccounts();

        IO.println("\nAfter monthly processing:");
        bank.printAllSummaries();
    }
}
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Lexicon Bank");

        bank.addAccount(
                new SavingsAccount("Alice",  1000, 0.02)
        );

        bank.addAccount(
                new CheckingAccount("Bob", 500, 25)
        );

        bank.addAccount(
                new LoanAccount("Charlie", 5000, 0.03)
        );

        bank.addAccount(
                new SavingsAccount("Jesper", 25000, 0.07)
        );

        IO.println("Before monthly processing:");
        bank.printAllSummaries();

        IO.println("\nProcessing all accounts:");
        bank.processAllAccounts();

        IO.println("\nAfter monthly processing:");
        bank.printAllSummaries();
    }
}
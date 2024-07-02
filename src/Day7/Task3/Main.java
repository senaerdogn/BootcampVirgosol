package Day7.Task3;

public class Main {
    public static void main(String[] args) {
        BankAccount cAccount = new CheckingAccount();
        cAccount.withdraw();
        cAccount.deposit();

        BankAccount sAccount = new SavingsAccount();
        sAccount.withdraw();
        sAccount.deposit();
    }
}

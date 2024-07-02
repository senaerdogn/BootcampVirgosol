package Day7.Task3;

public class SavingsAccount extends BankAccount{

    @Override
    public void withdraw() {
        System.out.println("Bu hesap tasarruf hesabıdır ve para çekebilirsiniz...");
    }

    @Override
    public void deposit() {
        System.out.println("Bu hesap tasarruf hesabıdır ve para yatırabilirsiniz...");
    }
}

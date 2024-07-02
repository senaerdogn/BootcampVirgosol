package Day7.Task3;

public class CheckingAccount extends BankAccount{

    @Override
    public void withdraw() {
        System.out.println("Bu hesap mevduat hesabıdır ve para çekebilirsiniz...");
    }

    @Override
    public void deposit() {
        System.out.println("Bu hesap mevduat hesabıdır ve para yatırabilirsiniz...");
    }
}

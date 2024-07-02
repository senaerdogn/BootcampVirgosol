package Day7.Task3;

abstract class BankAccount {
    public abstract void withdraw();
    public abstract void deposit();
}
/*
*Task: Banka Hesapları*
   - Bir BankAccount (Banka Hesabı) abstract sınıfı tanımlayın ve withdraw() ve deposit() gibi abstract metotlar ekleyin.
   - Bu sınıftan türeyen SavingsAccount (Tasarruf Hesabı) ve CheckingAccount (Mevduat Hesabı) sınıfları oluşturun ve bu metotları implement edin.
   - Her iki hesap türünden örnekler oluşturun ve her biri için para yatırma (deposit) ve para çekme (withdraw) işlemleri gerçekleştirin.
 */
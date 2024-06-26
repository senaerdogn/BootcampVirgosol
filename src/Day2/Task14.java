package Day2;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci kelimeyi giriniz: ");
        String word1 = scanner.nextLine();
        System.out.print("İkinci kelimeyi giriniz: ");
        String word2 = scanner.nextLine();

        if (word1.equals(word2)){
            System.out.println("Kelimeler eşit.");
        }
        else{
            System.out.println("Kelimeler eşit değil.");
        }
    }
}
/*Kullanıcıdan iki kelime girmesini isteyen ve bu kelimelerin eşit olup olmadığını kontrol eden programı yazınız.

	Örnek Girdi:
	Birinci kelimeyi giriniz: Merhaba
	İkinci kelimeyi giriniz: Merhaba

	Örnek Çıktı:
	Kelimeler eşit.*/
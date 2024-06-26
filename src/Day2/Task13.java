package Day2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String metin = scanner.nextLine();

        System.out.println("Aranacak karakter: ");
        char ch = scanner.next().charAt(0);

        for (int i = 0; i < (metin.length()); i++) {
            if (metin.charAt(i) == ch) {
                System.out.println("Karakter " + ch + ", " + i + ". indekste bulunuyor.");
            }
        }
    }
}
/*Kullanıcıdan bir metin ve bir karakter girmesini isteyen ve metindeki karakterin pozisyonunu bulan bir program yazınız.

	Örnek Girdi:
	Bir metin giriniz: Merhaba Dünya
	Aranacak karakter: a

	Örnek Çıktı:
	Karakter 'a' 4. pozisyonda bulunuyor.*/
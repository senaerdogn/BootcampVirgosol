package Day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        if (sayi < 0){
            System.out.println("Sayı negatiftir.");
        }
    }
}
/*Kullanıcıdan bir tam sayı girmesini isteyen ve eğer sayı negatif ise "Sayı negatiftir" mesajını yazdıran programı yazınız.

   Örnek Girdi:
   Bir tam sayı giriniz: -5

   Örnek Çıktı:
   Sayı negatiftir*/
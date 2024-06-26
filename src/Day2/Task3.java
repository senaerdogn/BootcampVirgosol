package Day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int num1 = scanner.nextInt();
        System.out.print("\nİkinci sayıyı giriniz: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
    }
}
/*Kullanıcıdan iki tam sayı girmesini isteyen ve bu sayıların çarpımını ekrana yazdıran programı yazınız.

   Örnek Girdi:
   İlk sayıyı giriniz: 4
   İkinci sayıyı giriniz: 5

   Örnek Çıktı:
   Sayıların çarpımı: 20*/
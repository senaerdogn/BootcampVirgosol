package Day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Kelime Giriniz: ");
        String word = scanner.nextLine();
        System.out.println(word + " kelimesinin uzunluğu: " + word.length());
    }
}
/*Kullanıcıdan bir kelime girmesini isteyen ve kelimenin uzunluğunu ekrana yazdıran programı yazınız.

   Örnek Girdi:
   Bir kelime giriniz: merhaba

   Örnek Çıktı:
   Kelimenin uzunluğu: 7*/
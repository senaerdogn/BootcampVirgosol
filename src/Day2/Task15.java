package Day2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir yıl giriniz: ");
        int year = scanner.nextInt();

        if (year>0) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " bir artık yıldır.");
            } else {
                System.out.println(year + " bir artık yıl değildir.");
            }
        } else {
            System.out.println("Geçersiz Değer!");
        }
    }
}
/*Girilen bir yılın artık yıl olup olmadığını belirleyen bir Java programı yazınız.
Programınızın çıktısı, yılın artık yıl olup olmadığını doğru bir şekilde göstermelidir.

   Örnek Girdi:
   Bir yıl giriniz: 2020

   Örnek Çıktı:
   2020 bir artık yıldır.*/
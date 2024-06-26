package Day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci kenar uzunluğunu giriniz: ");
        int num1 = scanner.nextInt();
        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        int num2 = scanner.nextInt();
        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
        int num3 = scanner.nextInt();

        if ((num1 == num2) && (num2 == num3)) {
            System.out.println("Bu üçgen eşkenar üçgendir.");
        } else {
            System.out.println("Bu üçgen eşkenar üçgen değildir.");
        }
    }
}
/*Kullanıcıdan bir üçgenin kenar uzunluklarını girmesini isteyen ve bu üçgenin eşkenar olup olmadığını belirleyen programı yazınız.

   Örnek Girdi:
   Birinci kenar uzunluğunu giriniz: 5
   İkinci kenar uzunluğunu giriniz: 5
   Üçüncü kenar uzunluğunu giriniz: 5

   Örnek Çıktı:
   Bu üçgen eşkenar üçgendir*/
package Day7;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayı: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("İkinci sayı: ");
        double sayi2 = scanner.nextDouble();

        try {
            if (sayi2 == 0) throw new ArithmeticException();
            System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1/sayi2));
        } catch (ArithmeticException e) {
            System.out.println("Bölen sayı 0 olmamalı!!!");
        }
    }
}
/*
*Task: Bölme İşlemi*
   - Kullanıcıdan alınan iki sayıyı birbirine bölen bir program yazın.
   - Bölme işlemi sırasında ortaya çıkabilecek ArithmeticException'ı try-catch bloğu içinde ele alarak uygun bir mesajla kullanıcıya hatayı bildirin.
 */
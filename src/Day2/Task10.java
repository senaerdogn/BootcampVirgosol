package Day2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci cümleyi giriniz: ");
        String cumle1 = scanner.nextLine();
        System.out.print("İkinci cümleyi giriniz: ");
        String cumle2 = scanner.nextLine();

        if(cumle1.length() > cumle2.length()){
            System.out.println("Uzun olan cümle: " + cumle1);
        } else if (cumle1.length() < cumle2.length()) {
            System.out.println("Uzun olan cümle: " + cumle2);
        }else {
            System.out.println("İki cümlenin uzunluğu birbirine eşittir.");
        }
    }
}
/*Girilen iki cümleden uzun olanı bulan bir program yazın.

	Örnek Girdi:
	Birinci cümleyi giriniz: Merhaba Dünya
	İkinci cümleyi giriniz: Java programlama dili

	Örnek Çıktı:
	Uzun olan cümle: Java programlama dili*/
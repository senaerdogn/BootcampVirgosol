package Day3;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String ifade giriniz: ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(str.charAt(i) + " ");
            }
        }
    }

}

//Verilen bir string içerisindeki benzersiz karakterleri bulan ve bunları ekrana yazdıran bir Java programı yazın.
//Benzersiz karakterler, string içerisinde sadece bir kez geçen karakterlerdir.
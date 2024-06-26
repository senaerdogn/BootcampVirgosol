package Day3;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String word = scanner.next();

        String reverseWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }
        System.out.println("Kelimenin tersi: " + reverseWord);

        if (word.equalsIgnoreCase(reverseWord)) {
            System.out.println(word + " ve " + reverseWord + ": Eşit");
        } else {
            System.out.println(word + " ve " + reverseWord + ": Eşit Değil!");
        }
    }
}
//Verilen bir string kelimenin  palindromik olup olmadığını bulan bir Java programı yazın.
//Palindromik ileri ve geri okunduğunda aynı olan kelimedir. (Örnek:  kayak)
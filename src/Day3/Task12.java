package Day3;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = scanner.nextInt();

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
    }
}
//Bir sayının asal çarpanlarını bulan bir Java programı yazın.
//Kullanıcının girdiği bir sayının asal çarpanlarını ve bu çarpanların sayısını ekrana yazdırın.
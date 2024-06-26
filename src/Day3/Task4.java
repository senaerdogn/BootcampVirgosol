package Day3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        boolean prime = true;

        if (number >= 2) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
            System.out.println(number + " asal bir sayı mı? " + prime);
        } else {
            System.out.println("1'den büyük tam sayı giriniz!");
        }
    }
}
//Bir sayının asal olup olmadığını for döngüsü kullanarak kontrol eden bir Java programı yazın.
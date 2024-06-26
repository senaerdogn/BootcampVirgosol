package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {3, 9, 45};
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println(number + " sayısı dizide bulunmaktadır.");
            }
        }
    }
}
//int tipinde bir dizi oluşturun ve kullanıcıdan bir sayı alın. Bu sayının dizide olup olmadığını kontrol edin ve sonucu ekrana yazdırın.
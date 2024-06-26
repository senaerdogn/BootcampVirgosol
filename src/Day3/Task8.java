package Day3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        int sum=0;
        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Girilen sayının rakamları toplamı: " + sum);
    }
}
//Bir sayının basamaklarını toplayan ve while döngüsü kullanan bir Java programı yazın.
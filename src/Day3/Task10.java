package Day3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        int sum=0;
        for (int i = 0; i <= number; i++) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Girilen sayının rakamları toplamı: " + sum);
    }
}
//For döngüsü kullanarak bir sayının basamaklarını toplayan bir Java programı yazın.
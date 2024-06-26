package Day3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, sum=0;
        do {
            System.out.print("Bir sayı giriniz: ");
            num = scanner.nextInt();
            sum += num;
        }while(num != 0);

        System.out.println("Girilen sayıların toplamı: " + sum);
    }
}
//Kullanıcıdan alınan sayılarla toplama işlemi yapan ve kullanıcı 0 girene kadar devam eden do-while döngüsü kullanan bir Java programı yazın.
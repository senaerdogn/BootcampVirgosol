package Day2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");
        int number = scanner.nextInt();

        if(number > 0){
            System.out.println("Sayı pozitiftir.");
        } else if (number < 0) {
            System.out.println("Sayı negatiftir.");
        }
        else{
            System.out.println("Sayı sıfırdır.");
        }
    }
}
/*Kullanıcıdan bir tam sayı girmesini isteyen ve bu sayının pozitif, negatif veya sıfır olduğunu belirten programı yazınız.

   Örnek Girdi:
   Bir tam sayı giriniz: 0

   Örnek Çıktı:
   Sayı sıfırdır*/
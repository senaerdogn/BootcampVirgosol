package Day7;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitif bir tam sayı giriniz: ");
        int sayi = scanner.nextInt();

        if(sayi == 0){
            throw new Exception("Yanlış sayı girdiniz");
        } else if (sayi < 0) {
            System.out.println("Negatif sayı girdiniz");
        }else {
            System.out.println("Pozitif sayı girdiniz, giriş başarılı!...");
        }
    }
}
/*
Task: throw new Exception() *
   - Kullanıcıdan pozitif tamsayı girmesini isteyin (Scanner)
   - Kullanıcı sıfır değerini girmişse "yanlış sayı girdiniz" exception mesajı fırlatan kodu yazınız.
 */
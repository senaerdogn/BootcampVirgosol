package Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("10 farklı tam sayı giriniz: ");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            list.add(number);
        }

        int tek=0, cift=0;
        for (Integer num: list){
            if (num % 2 != 0){
                tek++;
            }
            else {
                cift++;
            }
        }
        System.out.println("Girilen sayılar: " + list);
        System.out.println("Tek Sayı Adedi: " + tek);
        System.out.println("Çift Sayı Adedi: " + cift);
    }
}
//Bir ArrayList kullanarak kullanıcıdan alınan 10 farklı tam sayıyı saklayın.
//Bu tam sayılardan kaç tanesinin çift, kaç tanesinin tek olduğunu bulan ve sonucu ekrana yazdıran bir program yazın.
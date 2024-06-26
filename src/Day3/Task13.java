package Day3;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <= 1000; i++) {
            if (Palindrom(i)) {
                sum += i;
            }
        }
        System.out.println("1-1000 aralığındaki palindromik sayılar toplamı: " + sum);
    }

    public static boolean Palindrom(int num) {
        String numberStr = String.valueOf(num);
        String reverseNumberStr = new StringBuilder(numberStr).reverse().toString();
        return numberStr.equals(reverseNumberStr);
    }
}
//Bir aralık belirleyerek (örneğin 1 ile 1000 arası) bu aralıktaki palindromik sayıların toplamını hesaplayan bir Java programı yazın.
//Palindromik sayılar, aynı şekilde okunan sayılardır (örneğin 121, 131).
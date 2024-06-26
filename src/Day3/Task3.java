package Day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        int num1=1, num2=1;
        while (num1 <= number){
            System.out.print(num1 + " ");
            int nextNumber = num1 + num2;
            num1 = num2;
            num2 = nextNumber;
        }
    }
}
//Kullanıcıdan alınan bir sayıya kadar Fibonacci serisini while döngüsü kullanarak yazdıran bir Java programı yazın.

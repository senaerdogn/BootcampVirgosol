package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        String[] names = {"Ali", "Veli", "Ayşe", "Fatma"};
        System.out.println("Dizinin Eski Hali: " + Arrays.toString(names));
        updateArr(names);
    }

    public static void updateArr(String[] dizi){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin yeni elemanları: ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(i+1 + ". eleman: ");
            dizi[i] = scanner.nextLine();
        }
        System.out.println("Dizinin Güncellenmiş Hali: " + Arrays.toString(dizi));
    }
}
//Bir sınıf oluşturun ve bu sınıfta bir dizi tanımlayın. Dizi elemanlarını bir metod içinde güncelleyin ve ekrana yazdırın.
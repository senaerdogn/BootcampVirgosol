package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,11,12,20,21,22,30,31,32,40,41,42,50,51,52,60,61,63,70,71));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) + sayi == 100) {
                    System.out.print(list.get(i) + "-" + list.get(j) + "  ");
                }
            }
        }
    }
}
//Bir ArrayList oluşturun ve içine 20 rastgele tam sayı ekleyin.
//Kullanıcıdan bir sayı alın ve bu sayının listedeki elemanlarla toplamının 100 olduğu tüm çiftleri bulun ve ekrana yazdırın.
//??????????????????
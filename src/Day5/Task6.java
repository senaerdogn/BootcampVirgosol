package Day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3, 8, 69, 45, 123));
        System.out.println("Dizinin İlk Hali: " + list);
        list.set(3, 85);
        System.out.println("Dizinin Güncellenmiş Hali: " + list);;
    }
}
//Bir ArrayList oluşturun ve içine birkaç sayı ekleyin. Belirli bir indekste bulunan sayıyı başka bir sayıyla değiştirin ve sonucu ekrana yazdırın.
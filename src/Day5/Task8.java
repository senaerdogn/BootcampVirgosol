package Day5;

import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(5, 9, -85, 21, 4));
        System.out.println("Dizi: " + numbers);

        int sum=0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Dizideki Elemanlar Toplamı: " + sum);
    }
}
//Bir ArrayList oluşturun ve içine Integer wrapper sınıfı kullanarak birkaç sayı ekleyin.
//Bu sayıları ekrana yazdırın ve ardından toplamını hesaplayarak ekrana yazdırın.
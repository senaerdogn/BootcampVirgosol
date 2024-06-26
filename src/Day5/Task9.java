package Day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 5, 10, 8, 11, 6));
        System.out.println("Array List: " + list);
        int sum=0;
        double avg=0.0;
        for (Integer i : list) {
            sum += i;
        }
        avg = (double) sum / list.size();
        System.out.println("Elemanların Ortalaması:" + avg);

        System.out.print("Ortalamadan Büyük Olan Elemanlar: ");
        for (int i = 0; i < list.size(); i++) {
            if (avg < list.get(i)){
                System.out.print(list.get(i) + " ");
            }
        }

        System.out.print("\nOrtalamadan Küçük Olan Elemanlar: ");
        for (int i = 0; i < list.size(); i++) {
            if (avg > list.get(i)){
                System.out.print(list.get(i) + " ");
            }
        }
    }
}
//Bir ArrayList oluşturun ve içine birkaç Integer değer ekleyin.
//Bu değerlerin ortalamasını hesaplayın.
//Ardından, listedeki her elemanın ortalamadan büyük mü küçük mü olduğunu kontrol edin
//ve ortalamanın üstündeki ve altındaki değerleri ayrı ayrı ekrana yazdırın.
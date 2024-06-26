package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task20 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.addAll(Arrays.asList(10.4, 3.2, 7.5, 6.8, 12.3));
        Collections.sort(list);
        System.out.println("Dizinin sıralanmış hali: " + list);

        double min = list.get(0);
        double max = list.get(list.size()-1);
        System.out.println("Minimum eleman: " + min);
        System.out.println("Maximum eleman: " + max);

        double sum = 0.0, avg = 0.0;
        for (double num: list){
            sum += num;
        }
        avg = sum / list.size();
        System.out.println("Dizinin ortalaması: " + avg);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < avg){
                System.out.println(list.get(i) + " ortalamadan küçüktür.");
            }
            else{
                System.out.println(list.get(i) + " ortalamadan büyüktür.");
            }
        }
    }
}
//Bir ArrayList oluşturun ve içine birkaç Double değer ekleyin.
//Bu değerlerden en büyük ve en küçük olanını bulun.
//Ardından, listedeki tüm elemanların ortalamasını hesaplayın ve bu ortalamayı ekrana yazdırın.
//Son olarak, listedeki her elemanı ortalamadan büyük mü küçük mü diye kontrol edin ve sonuçları ayrı ayrı ekrana yazdırın.
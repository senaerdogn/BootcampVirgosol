package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Task14 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(123, 85, 635, 78, -3));

        int min = minBul(list);
        int max = maxBul(list);

        System.out.println("ArrayList Elemanları: " + list);
        System.out.println("Minimum Eleman: " + min);
        System.out.println("Maximum Eleman: " + max);

    }
    public static int minBul(ArrayList<Integer> list) {
        return Collections.min(list);
    }
    public static int maxBul(ArrayList<Integer> list) {
        return Collections.max(list);
    }
}
//Bir ArrayList oluşturun ve içine birkaç sayı ekleyin. Bu sayılar arasından en küçük ve en büyük sayıları bulun ve sonucu ekrana yazdırın.
package Day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(125);
        list.add(52.8);
        boolean x = list.add(false);
        System.out.println(list);
    }
}
//int, double ve boolean tiplerinde 3 farklı değeri tutan bir ArrayList oluşturun ve bu değerleri ekrana yazdırın.
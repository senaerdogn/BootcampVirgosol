package Day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        city.addAll(Arrays.asList("Ankara", "İstanbul", "İzmir", "Bursa", "Muğla"));
        System.out.println(city);
    }
}
//ArrayList sınıfını kullanarak bir ArrayList oluşturun ve içine 5 farklı şehir ekleyin. Bu şehirleri ekrana yazdırın.
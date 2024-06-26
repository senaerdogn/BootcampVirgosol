package Day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task21 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.addAll(Arrays.asList("İstanbul", "İzmir", "Ankara", "istanbul", "Antalya", "Çanakkale"));

        cities.removeIf(n -> n.toLowerCase().startsWith("i"));
        System.out.println(cities);
    }
    }

/*ArrayList<String> cities = new ArrayList<>();
        cities.addAll(Arrays.asList("İstanbul", "İzmir", "Ankara", "Antalya", "Çanakkale"));
        olan bir cities listesinden "İ" harfi ile başlayan illeri çıkarmak (silmek) istiyorum.
        Bu soruyu da çözebilir misiniz?
bu listenin dinamik olduğunu hangi ilin hangi indekste olduğunu bilmediğimizi kabul ederek çözelim.*/
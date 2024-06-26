package Day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Ali", "Veli", "Ayşe", "Fatma", "Efe"));

        list.add(0, "Karan");
        list.add("Berkay");
        System.out.println(list);
    }
}
//Bir ArrayList oluşturun ve içine birkaç kelime ekleyin. Listenin başına ve sonuna yeni kelimeler ekleyin,
//ardından listeyi sıralayın ve sonucu ekrana yazdırın.
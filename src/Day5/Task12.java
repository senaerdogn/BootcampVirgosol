package Day5;

import java.util.*;

public class Task12 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("sena", "edirne", "ankara", "meyve", "efeler"));

        char harf = 'e';
        for (String kelime : list) {
            int count = harfSayisiBul(kelime, harf);
            System.out.println(kelime + " kelimesi içinde " + harf + " harfinden " + count + " adet vardır.");
        }
    }
    public static int harfSayisiBul(String word, char target) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}
//Bir ArrayList oluşturun ve içine birkaç kelime ekleyin.
//Her kelimenin içindeki belirli bir harfin sayısını bulan bir metot yazın ve sonucu ekrana yazdırın.
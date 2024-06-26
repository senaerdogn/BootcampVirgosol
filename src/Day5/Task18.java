package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task18 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Sena", "Ali", "Berkay", "Eskişehir", "Karan"));

        ArrayList<Integer> wordsLengths = new ArrayList<>();
        for (String word : words) {
            wordsLengths.add(word.length());
        }
        System.out.println("Kelimelerin uzunluğu: " + wordsLengths);
        Collections.sort(wordsLengths);
        System.out.println(wordsLengths);

        for (String word : words) {
            if (word.length() == wordsLengths.get(0)) {
                System.out.println("En kısa kelime: " + word);
            } else if (word.length() == wordsLengths.get(wordsLengths.size()-1)) {
                System.out.println("En uzun kelime: " + word);
            }
        }
    }
}
//Bir ArrayList oluşturun ve içine birkaç kelime ekleyin.
//Her kelimenin uzunluğunu tutan bir ArrayList daha oluşturun ve bu uzunlukları sıralı olarak ekrana yazdırın.
//Son olarak, en uzun ve en kısa kelimeleri bularak ekrana yazdırın.

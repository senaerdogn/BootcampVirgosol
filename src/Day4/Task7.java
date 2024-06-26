package Day4;
import java.util.Arrays;
public class Task7 {
    public static void main(String[] args) {
        int[] numbers = {10, -78, 7, 560, 21, 9, -990};
        kucuktenBuyuge(numbers);
        System.out.println("Küçükten Büyüğe: " + Arrays.toString(numbers));
    }

    public static void kucuktenBuyuge(int[] arr) {
        Arrays.sort(arr);
    }
}
//Bir dizinin elemanlarını küçükten büyüğe sıralayan bir metod yazın.
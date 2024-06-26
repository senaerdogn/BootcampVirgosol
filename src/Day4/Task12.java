package Day4;
import java.util.Arrays;
public class Task12 {
    public static void main(String[] args) {
        int[] orjArray = {4, 3, 1, 6, 5, 8, 2, 7, 9};
        int[] copiedArray = arrayKopyala(orjArray, 3, 8);

        System.out.print("İlk Dizi: ");
        for (int i : orjArray) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        System.out.print("Kopyalanan Dizi([3,8]): ");
        for (int i : copiedArray) {
            System.out.print(i + " ");
        }
    }
    public static int[] arrayKopyala(int[] arr, int startIndex, int endIndex) {

        if (startIndex<0 || endIndex>arr.length || startIndex>endIndex) {
            throw new IllegalArgumentException("Geçersiz aralık!");
        }
        return Arrays.copyOfRange(arr, startIndex, endIndex);
    }
}
//Bir dizinin belirli bir aralıktaki elemanlarını kopyalayan ve yeni bir dizi oluşturan bir metod yazın.
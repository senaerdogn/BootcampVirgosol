package Day4;
import java.util.Arrays;
public class Task16 {
    public static void main(String[] args) {
        int[] dizi1 = {1,2,3,4};
        int[] dizi2 = {5,6,7,8,9,10};
        System.out.println("Dizi 1: " + Arrays.toString(dizi1));
        System.out.println("Dizi 2: " + Arrays.toString(dizi2));

        int[] dizi3 = diziBirlestir(dizi1,dizi2);
        System.out.println("İki Dizinin Birleşimi: " + Arrays.toString(dizi3));

    }
    public static int[] diziBirlestir(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }
        for (int j = arr1.length; j < arr3.length; j++) {
            arr3[j] = arr2[j-arr1.length];
        }
        return arr3;
    }
}
//İki diziyi birleştiren ve yeni bir dizi oluşturan bir metod yazın.
package Day5;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] dizi = {3, 5, -18, 104, 0};
        System.out.print("Array: ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
        reverseArray(dizi);
    }
    public static int[] reverseArray(int[] arr){

        System.out.println();
        System.out.print("Reversed Array: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
//int tipinde bir dizi oluşturun ve bu diziyi tersine çeviren bir metot yazın. Bu metodu çağırarak sonucu ekrana yazdırın.
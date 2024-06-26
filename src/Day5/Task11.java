package Day5;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] dizi = {8, -15, 0, 22, 3, -57};
        sıralama(dizi);
        System.out.println(Arrays.toString(dizi));
    }

    public static void sıralama(int[] arr){
        Arrays.sort(arr);
    }
}
//int tipinde bir dizi oluşturun ve bu diziyi sıralayan bir metot yazın. Bu metodu çağırarak sonucu ekrana yazdırın.

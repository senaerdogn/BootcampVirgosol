package Day4;
import java.util.Arrays;
public class Task18 {
    public static void main(String[] args) {
        int[] dizi = {1,2,3,4,5,6};
        System.out.println("Orjinal Dizi: " + Arrays.toString(dizi));
        int deger= 3, yeniDeger=9;
        boolean sonuc = elemanGuncelle(dizi, deger, yeniDeger);
        System.out.println("Dizi Güncellendi mi? " + sonuc);
        System.out.println("Güncellenmiş Dizi: " + Arrays.toString(dizi));

    }
    public static boolean elemanGuncelle(int[] arr, int value, int newValue){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value){
                arr[i] = newValue;
                return true;
            }
        }
        return false;
    }
}
/*Bir dizinin belirli bir elemanını bulup güncelleyen bir metod yazın.
method ayrıca eleman dizide varsa ve güncelleme gerçekleşirse true, yoksa false dönsün*/
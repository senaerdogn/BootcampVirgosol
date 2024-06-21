package Day4;
import java.util.Arrays;
public class Task19 {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5};
        int sayi = 3;
        System.out.println("Orjinal Dizi: " + Arrays.toString(dizi));
        System.out.println("Silinecek Sayı: " + sayi);
        int[] yeniDizi = elemanSil(dizi, sayi);
        System.out.println("Güncellenmiş Dizi: " + Arrays.toString(yeniDizi));

    }
    public static int[] elemanSil(int[] arr, int hedef){
        int[] newArr = new int[arr.length-1];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=hedef){
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }
}
/*Bir dizide belirli bir elemanı silen ve yeni bir dizi döndüren bir metod yazın.
ipucu: yeni dizinin boyutu bir azalmalı*/
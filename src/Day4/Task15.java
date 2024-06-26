package Day4;

public class Task15 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 6, 12, 8, 7, 4, 2};
        System.out.println("Dizideki elemanlar toplamı: " + elemanlariTopla(arr));
    }
    public static int elemanlariTopla(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
//Bir dizideki elemanları birbirine toplayan ve sonucu döndüren bir metod yazın.
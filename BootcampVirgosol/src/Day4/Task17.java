package Day4;

public class Task17 {
    public static void main(String[] args) {
        int[] dizi= {1,2,3,4,5,6,7,8,9,10};
        int sayi= 5;
        boolean sonuc = isInclude(dizi,sayi);
        System.out.println("Dizi " + sayi + " elemanını içeriyor mu? " + sonuc);
    }
    public static boolean isInclude(int[] arr, int hedef){
        for (int i: arr){
            if(i==hedef){
                return true;
            }
        }
        return false;
    }
}
//Bir dizide belirli bir elemanın bulunup bulunmadığını kontrol eden bir metod yazın.
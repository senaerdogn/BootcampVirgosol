package Day4;

public class Task14 {
    public static void main(String[] args) {
        int[] orjArr = {4, 3, 1, 6, 12, 8, 7, 4, 2};
        int[] tek = tekSayiBul(orjArr);

        System.out.print("Orjinal Dizi: ");
        for (int i : orjArr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.print("Tek Sayıları İçeren Dizi: ");
        for (int j : tek) {
            System.out.print(j + " ");
        }
    }

    public static int[] tekSayiBul(int[] arr){
        //kaç tek sayı olduğunu bulur.
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        //kaç tek sayı varsa o boyutta array oluşturup çift sayıları yeni diziye atar.
        int[] tekArr = new int[count];
        int j=0;
        for (int number : arr) {
            if (number % 2 != 0) {
                tekArr[j] = number;
                j++;
            }
        }
        return tekArr;
    }
}
//Bir dizideki tek sayıları bulan ve bunları başka bir diziye ekleyen bir metod yazın.

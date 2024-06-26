package Day4;

public class Task13 {
    public static void main(String[] args) {
        int[] orjArr = {4, 3, 1, 6, 12, 8, 7, 4, 2};
        int[] cift = ciftSayiBul(orjArr);

        System.out.print("Orjinal Dizi: ");
        for (int i : orjArr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.print("Çift Sayıları İçeren Dizi: ");
        for (int j : cift) {
            System.out.print(j + " ");
        }
    }

    public static int[] ciftSayiBul(int[] arr){
        //kaç çift sayı olduğunu bulur.
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        //kaç çift sayı varsa o boyutta array oluşturup çift sayıları yeni diziye atar.
        int[] ciftArr = new int[count];
        int j=0;
        for (int number : arr) {
            if (number % 2 == 0) {
                ciftArr[j] = number;
                j++;
            }
        }
        return ciftArr;
    }
}
//Bir dizideki çift sayıları bulan ve bunları başka bir diziye ekleyen bir metod yazın.
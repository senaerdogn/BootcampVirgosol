package Day4;

public class Task11 {
    public static void main(String[] args) {
        int[] orjArr = {4,3, 1, 6, 4, 8, 2, 4, 2};
        int[] copiedArr = arrayKopyala(orjArr);

        System.out.print("Orjinal Dizi: ");
        for (int i : orjArr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.print("Kopyalanan Dizi: ");
        for (int j : copiedArr) {
            System.out.print(j + " ");
        }
    }
    public static int[] arrayKopyala(int[] arr) {
        int[] copiedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copiedArr[i] = arr[i];
        }
        return copiedArr;
    }
}
//Bir dizinin elemanlarını kopyalayan ve yeni bir dizi oluşturan bir metod yazın.

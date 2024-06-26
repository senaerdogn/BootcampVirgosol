package Day4;

public class Task10 {
    public static void main(String[] args) {
        int[] numbers = {4,3, 1, 6, 4, 8, 2, 4, 2};

        int sayı = indexBul(numbers, 1);

        if (sayı == -1) {
            System.out.println("Dizide 1 değeri bulunamadı.");
        }
        else {
            System.out.println("1 rakamı " + sayı + ". indexte bulunmaktadır.");
        }
    }

    public static int indexBul(int[] arr, int hedef) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == hedef) {
                return i;
            }
        }
        return -1;
    }
}
//Bir dizide belirli bir değeri arayan ve bulunduğu indeksi döndüren bir metod yazın.
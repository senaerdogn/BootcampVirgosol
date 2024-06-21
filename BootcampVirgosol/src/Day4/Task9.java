package Day4;

public class Task9 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 3, 3, 2, 8, 3, 4, 3, 5, 1};

        System.out.println("3 değerinden " + kacTaneVar(numbers, 3) + " adet vardır.");
    }

    public static int kacTaneVar(int[] arr, int hedef) {
        int sayac = 0;

        for (int i : arr) {
            if (i == hedef) {
                sayac++;
            }
        }
        return sayac;
    }
}
//Bir dizide belirli bir değere sahip kaç adet eleman olduğunu bulan bir metod yazın.
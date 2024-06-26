package Day4;

public class Task6 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Elemanların Ortalaması:" + averageOfTheNumbers(numbers));
    }

    public static double averageOfTheNumbers(int[] arr) {
        double sum=0, sonuc=0;

        for (int i : arr) {
            sum += i;
        }
        sonuc = sum/arr.length;
        return sonuc;
    }
}
//Bir diziyi parametre olarak alan ve dizideki elemanların ortalamasını bulan bir metod yazın.
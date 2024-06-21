package Day4;

public class Task5 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 7, 5, 2, -9, -9};
        System.out.println("Elemanlar Toplamı:" + sumOfTheNumbers(numbers));
    }

    public static int sumOfTheNumbers(int[] arr) {
        int sum=0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
//Bir diziyi parametre olarak alan ve dizideki elemanların toplamını bulan bir metod yazın.
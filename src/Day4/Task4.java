package Day4;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {10, -78, 7, 560, 21, 9, -990};
        System.out.println("En küçük eleman:" + smallestNumber(numbers));
    }

    public static int smallestNumber(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int number : arr) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
//Bir diziyi parametre olarak alan ve dizideki en küçük elemanı bulan bir metod yazın.

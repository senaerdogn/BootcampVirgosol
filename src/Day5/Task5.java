package Day5;

public class Task5 {
    public static void main(String[] args) {
        int[] numbers = {0, -95, 67, 999, -821, 84};
        System.out.println("En büyük sayı:" + maxNumber(numbers));
    }

    public static int maxNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int number : arr) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
//int tipinde bir dizi oluşturun ve bu dizideki en büyük sayıyı bulan bir metot yazın. Bu metodu çağırarak sonucu ekrana yazdırın.
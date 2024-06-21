package Day4;

public class Task8 {
    public static void main(String[] args) {
        int[] numbers = {10, -78, 7, 560, 21, 9, -990};
        buyuktenKucuge(numbers);
        System.out.print("Büyükten Küçüğe: ");

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void buyuktenKucuge(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - 1 - i; j++)
            {
                if (arr[j] < arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
//Bir dizinin elemanlarını büyükten küçüğe sıralayan bir metod yazın.
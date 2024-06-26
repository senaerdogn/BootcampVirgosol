package Day5;
import java.util.ArrayList;
import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(123, 85, 635, 78, 3));

        for (Integer number : list) {
            int sum = sumOfDigits(number);
            System.out.println(number + " sayısının rakamları toplamı: " + sum);
        }
    }
    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum = sum + (number % 10);
            number = number / 10; // Remove the last digit from number
        }

        return sum;
    }
}
/*13. Bir ArrayList oluşturun ve içine birkaç Integer değer ekleyin. Bu Integer değerlerin her birinin rakamlarının toplamını
 hesaplayın ve bu toplamları ekrana yazdırın. Örneğin, listede 123 varsa, rakamların toplamı 6 olmalıdır (1 + 2 + 3). */
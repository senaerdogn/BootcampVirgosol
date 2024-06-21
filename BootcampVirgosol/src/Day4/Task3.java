package Day4;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {10, -78, 7, 560, 21, 9, -990};
        System.out.println("En büyük eleman:" + greatestNumber(numbers));
    }

    public static int greatestNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int number : arr) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
/*Başka bir yöntemle
package EgitimDay4;

public class Array1 {

    public static void main(String[] args) {
        int[] numbers = {12,4,54,-2,-56};
        int max= numbers[0];

        for (int number: numbers){
            if(number>max){
                max=number;
            }
        }
        System.out.println(max);
    }
}
*/

/*Bir diziyi parametre olarak alan ve dizideki en büyük elemanı bulan bir metod yazın.*/
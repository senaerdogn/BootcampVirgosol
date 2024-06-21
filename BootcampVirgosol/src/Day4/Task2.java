package Day4;

public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {10, 20, 30, 40, 50, 60};
        System.out.println("Array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        System.out.println("Reversed Array: ");
        for (int i = arr1.length-1; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }
    }
}
//Bir dizi oluşturun ve bu dizinin elemanlarını ters sırayla ekrana yazdırın.
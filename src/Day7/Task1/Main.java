package Day7.Task1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapı: ");
        double yaricap = scanner.nextDouble();

        Shape circle = new Circle();
        System.out.println("Dairenin Alanı: " + circle.calculateArea(yaricap));
        System.out.println("\n");

        System.out.print("Dikdörtgenin 1. Kenarı: ");
        double kenar1 = scanner.nextDouble();
        System.out.print("Dikdörtgenin 2. Kenarı: ");
        double kenar2 = scanner.nextDouble();
        Shape rectangle = new Rectangle();
        System.out.println("Dikdörtgenin Alanı: " + rectangle.calculateArea(kenar1, kenar2));
    }
}

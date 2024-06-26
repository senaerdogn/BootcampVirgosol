package Day3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir ifade giriniz: ");
        String ifade = scanner.nextLine();

        for (int i = 0; i < ifade.length(); i++) {
            char character = ifade.charAt(i);

            if (ifade.indexOf(character, i + 1) != -1) {
                System.out.print(character + " ");
            }
        }
    }
}
//For döngüsü kullanarak bir String ifadede tekrar eden karakterleri bulan bir Java programı yazın.
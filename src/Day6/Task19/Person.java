package Day6.Task19;

import java.util.Scanner;

public class Person {
    private String[] dizi = {"Sena", "Karan", "Berkay"};

    public String[] getDizi() {
        return dizi;
    }

    public void setDizi(String[] dizi) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin yeni elemanları: ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(i+1 + ". eleman: ");
            dizi[i] = scanner.nextLine();
        }
        this.dizi = dizi;
    }
}
//Bir sınıf oluşturun ve bu sınıfta private bir dizi tanımlayın. Bu dizi elemanlarını getter ve setter metodları ile güncelleyin ve ekrana yazdırın.
//?????????????
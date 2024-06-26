package Day5;

import java.util.*;

public class Task17 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3, -5, 4, 7, -1, 8, 0, -2, 10, 9));
        Collections.sort(list); //küçükten büyüğe sıraladık
        Collections.reverse(list); //ters çevirdik
        System.out.println(list);

        ArrayList<Integer> listSquare = new ArrayList<>();
        for (int num : list) {
            listSquare.add(num * num);
        }
        System.out.println("Sayıların Kareleri: " + listSquare);
    }
}
//Bir ArrayList oluşturun ve içine 10 farklı tam sayı ekleyin.
//Bu sayıları küçükten büyüğe sıralayın, ardından sıralanmış listeyi tersten yazdırın.
//Son olarak, listedeki her sayının karesini hesaplayarak yeni bir ArrayList içinde saklayın ve bu listeyi ekrana yazdırın.
package Day3;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Min değer: ");
        int min = scanner.nextInt();

        System.out.print("Max değer: ");
        int max = scanner.nextInt();

        int orjSayi, basamakSayisi, basamak, toplam;

        for (int sayi = min; sayi <= max; sayi++) {
            orjSayi = sayi;
            basamakSayisi = String.valueOf(sayi).length();
            toplam = 0;

            while (sayi != 0) {
                basamak = sayi % 10;
                toplam += Math.pow(basamak, basamakSayisi);
                sayi /= 10;
            }

            sayi = orjSayi;
            if (sayi == toplam) {
                System.out.print(sayi + " ");
            }
        }
    }
}
//Belirli bir aralıktaki tüm Armstrong sayıları bulan bir Java programı yazın.
//Bir sayının Armstrong sayısı olup olmadığını kontrol eden bir algoritma yazın.
//Armstrong sayısı, n basamaklı bir sayının, basamaklarının n’inci kuvvetleri toplamına eşit olduğu sayıdır (örneğin 153 = 1³ + 5³ + 3³).
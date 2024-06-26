package Day2;

public class Task9 {
    public static void main(String[] args) {
        String metin = "abc";

        for (int i = 0; i < metin.length(); i++) {
            char deger = metin.charAt(i);
            System.out.println(deger + " harfinin ASCII Karşılığı: " + (int) deger);
        }
    }
}
/*'abc' metinindeki ASCII değerlerini ekrana yazdıran programı yazınız.

    Örnek Çıktı:
	Karakter: a, ASCII Değeri: 97
	Karakter: b, ASCII Değeri: 98
	Karakter: c, ASCII Değeri: 99*/
package Day4;
import java.util.Arrays;
public class Task20 {
    public static void main(String[] args) {
        String text = "!Sena Efe!";
        System.out.println("String İfade: " + text);
        char[] charArr = karaktereAyir(text);
        System.out.println("Karakter Dizisi: " +Arrays.toString(charArr));
    }
    public static char[] karaktereAyir(String str){
        char[] karakter = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            karakter[i] = str.charAt(i);
        }
        return karakter;
    }
}
/*String bir ifadenin tüm karakterlerini bir diziye karakter karakter aktaran bir method yazın.
Method parametre olarak String almalı, return olarak dizi dönmeli.*/
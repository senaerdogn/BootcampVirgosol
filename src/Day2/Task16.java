package Day2;

public class Task16 {
    public static void main(String[] args) {
        String metin = "Bu kötü bir hikaye. Ancak, Ali'nin çabalarıyla daha iyi olabilir.";
        metin = metin.replace("kötü", "iyi").replace(".", "!");

        System.out.println(metin);
    }
}
/*Ali, yazdığı romanın bazı bölümlerinde "kötü" kelimesini "iyi" ile ve '.' karakterini '!' karakteri ile değiştirmek istemektedir.
Aşağıda verilen metin üzerinde bu değişiklikleri yapacak bir Java programı yazınız:
Girdi metni: "Bu kötü bir hikaye. Ancak, Ali'nin çabalarıyla daha iyi olabilir."

   Örnek Girdi:
   Bu kötü bir hikaye. Ancak, Ali'nin çabalarıyla daha iyi olabilir.

   Örnek Çıktı:
   Bu iyi bir hikaye! Ancak, Ali'nin çabalarıyla daha iyi olabilir!*/
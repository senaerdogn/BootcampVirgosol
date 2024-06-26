package Day1;

public class Task9 {
    public static void main(String[] args) {
        double aliPrice = 123.456;
        int aliPriceInt = (int) aliPrice;

        int veliBudget = 120;
        byte veliBudgetByte = (byte) veliBudget;

        int total = aliPriceInt + veliBudgetByte;

        System.out.println("Ali'nin fiyatı: " + aliPriceInt + " TL");
        System.out.println("Veli'nin birikimi: " + veliBudgetByte + " TL");
        System.out.println("Ali ve Veli toplamı: " + total + " TL");
    }
}
/*Ali ve Veli, marketten alışveriş yaparken aldıkları ürünlerin fiyatlarını hesaplamak istiyorlar.
Ali, bir ürünün fiyatını 123.456 TL olarak görüyor. Ancak Ali, ondalık kısmı görmek istemiyor ve bu fiyatı tam sayı olarak dönüştürmek istiyor.
Veli ise, kendi birikimlerini tam sayı olarak hesapladıktan sonra byte cinsine dönüştürmek istiyor.
Son olarak, Ali ve Veli aldıkları ürünlerin toplam fiyatını hesaplamak istiyorlar.

Ali ve Veli'nin bu dönüşümleri yaparak toplam fiyatı hesaplayan bir Java programı yazınız.
*/

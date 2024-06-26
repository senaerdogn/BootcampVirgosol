package Day5;

public class Task10 {
    public static void main(String[] args) {
        int sayi1=10, sayi2=15;
        double sayi3=52.0, sayi4=14.2;
        intSum(sayi1,sayi2);
        doubleSum(sayi3,sayi4);
    }

    public static void intSum(int num1, int num2){
        int sum=0;
        sum = num1 + num2;
        System.out.println("İnteger Değerler Toplamı: " + sum);
    }

    public static void doubleSum(double num3, double num4){
        double sum=0.0;
        sum = num3 + num4;
        System.out.println("Double Değerler Toplamı: " + sum);
    }
}
//int ve double tipinde iki sayının toplamını bulan iki farklı metot yazın.
//Bu metotları kullanarak çeşitli toplama işlemleri yapın ve sonucu ekrana yazdırın.
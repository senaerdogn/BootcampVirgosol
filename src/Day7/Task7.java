package Day7;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Program started!");
        try {
            //int a=10/0;
            Thread.sleep(5000);
            System.out.println("Program 5 saniye bekledi...");
        } catch (Exception e) {
            System.out.println("Hata ele alındı.");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally bloğu her durumda çalışır.");
        }
    }
}
/*
*Task: Thread.sleep(5000)*
   - Thread.sleep() metodu kullanın.
   - try-catch bloğu ile kodu çalışabilir hale dönüştürün.
 */
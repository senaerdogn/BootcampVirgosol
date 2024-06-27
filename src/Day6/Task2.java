package Day6;

public class Task2 {
    String name = "Sena";
    String surname = "Efe";
    int number = 271;

    void sayHi(){
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        Task2 student = new Task2();
        student.sayHi();
    }
}
//Bir sınıf oluşturun ve bu sınıf içinde bir metot tanımlayın. Metodu çağırarak ekrana "Hello, World!" yazdırın.
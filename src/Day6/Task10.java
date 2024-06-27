package Day6;

public class Task10 {
    String name;
    String surname;
    int age;

    public Task10(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Task10 object = new Task10("Sena", 14);
        System.out.println(object.name + " " + object.age + " yaşında.");
    }
}
//Bir sınıf oluşturun ve bu sınıfta bir constructor tanımlayın.
//Constructor içinde iki değişkeni başlatın ve bu değişkenlerin değerlerini ekrana yazdırın.
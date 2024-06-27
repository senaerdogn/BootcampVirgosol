package Day6;

public class Task3 {
    String name = "Sena";
    String surname = "Efe";
    int number = 271;

    public Task3(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Task3 student = new Task3("Sena");
        System.out.println(student.name);
    }
}
//Bir sınıf oluşturun ve bu sınıfa ait bir constructor tanımlayın. Constructor içinde bir değeri başlatın ve bu değeri ekrana yazdırın.
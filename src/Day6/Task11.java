package Day6;

public class Task11 {
    String name;
    String surname;
    int age;
    double weight;

    @Override
    public String toString() {
        return "Task11{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public Task11(String name, String surname, int age, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
    }

    public Task11(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Task11 person1 = new Task11("Karan", "Efe", 12, 58.4);
        System.out.println(person1);

        Task11 person2 = new Task11("Berkay", 29);
        System.out.println(person2);
    }
}
//Bir sınıf oluşturun ve bu sınıfta iki farklı constructor tanımlayın. Constructor'lar farklı parametreler alsın (overloading).
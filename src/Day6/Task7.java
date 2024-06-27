package Day6;

public class Task7 {
    String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Task7 object = new Task7();
        object.setAge(29);
        System.out.println(object.getAge());
    }
}
//Bir sınıf oluşturun ve bu sınıfta private bir değişken tanımlayın. Bu değişkeni getter ve setter metodları ile güncelleyin ve ekrana yazdırın.
package Day6.Task19;
import java.util.Arrays;
public class PersonObject {
    public static void main(String[] args) {
        Person object1 = new Person();
        System.out.println("Dizinin Eski Hali: " + Arrays.toString(object1.getDizi()));
        object1.setDizi(object1.getDizi());
        System.out.println("Dizinin Güncellenmiş Hali: " + Arrays.toString(object1.getDizi()));
    }
}

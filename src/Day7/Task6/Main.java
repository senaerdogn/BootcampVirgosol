package Day7.Task6;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.makeSound();
        cat.move();
        dog.makeSound();
        dog.move();
    }
}

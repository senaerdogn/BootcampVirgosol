package Day7.Task6;

public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Miyav miyav...");
    }

    @Override
    public void move() {
        System.out.println("Kedi mamasını yedi...");
    }
}

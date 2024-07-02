package Day7.Task4;

public class Car extends Vehicle{
    @Override
    public void start() {
        System.out.println("Car start edildi...");
    }

    @Override
    public void stop() {
        System.out.println("Car stop edildi...");
    }
}

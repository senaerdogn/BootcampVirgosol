package Day7.Task4;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motor = new Motorcycle();

        car.start();
        car.stop();
        motor.start();
        motor.stop();
    }
}

package Day6.Task16;

public class Vehicle {
    public String cins;
    public String model;
    public int yas;

    @Override
    public String toString() {
        return "Vehicle{" +
                "cins='" + cins + '\'' +
                ", yas=" + yas +
                '}';
    }

    public Vehicle(String cins, int yas) {
        this.cins = cins;
        this.yas = yas;
    }
}
//Bir üst sınıf ve bir alt sınıf oluşturun. Alt sınıf, üst sınıftan bir constructor miras alsın ve bu constructor'u kullanarak nesne oluşturun.
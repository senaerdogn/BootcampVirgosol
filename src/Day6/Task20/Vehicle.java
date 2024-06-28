package Day6.Task20;

public class Vehicle {
    public String cins;
    public String model;
    public int yas;

    @Override
    public String toString() {
        return "Vehicle{" +
                "cins='" + cins + '\'' +
                ", model='" + model + '\'' +
                ", yas=" + yas +
                '}';
    }

    public Vehicle(String cins, String model, int yas) {
        this.cins = cins;
        this.model = model;
        this.yas = yas;
    }
}
//Bir üst sınıf ve bir alt sınıf oluşturun. Alt sınıf, üst sınıftan bir constructor miras alsın ve bu constructor'u kullanarak nesne oluşturun.
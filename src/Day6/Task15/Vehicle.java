package Day6.Task15;

public class Vehicle {
        public String cins;
        public String model;
        public int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle(String model) {
        this.model = model;
    }
}
//Bir sınıf oluşturun ve bu sınıfta bir constructor tanımlayın.
//Constructor içinde bir değeri başlatın ve bu değeri getter metodu ile ekrana yazdırın.
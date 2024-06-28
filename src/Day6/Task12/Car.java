package Day6.Task12;

public class Car {
    public String marka;
    public String renk;
    public int fiyat;

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", renk='" + renk + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }

    public Car(String marka, int fiyat, String renk) {
        this.marka = marka;
        this.fiyat = fiyat;
        this.renk = renk;
    }

    public void korna(){
        System.out.println("Arabanın kornası çalıyor.");
    }
}
//Bir üst sınıf ve bir alt sınıf oluşturun. Alt sınıf, üst sınıftan bir metodu miras alsın ve çağırarak ekrana yazdırsın.

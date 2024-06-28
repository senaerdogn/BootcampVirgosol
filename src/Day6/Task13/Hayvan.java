package Day6.Task13;

public class Hayvan {
    public String isim;
    public String cins;
    public int yas;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public Hayvan(String isim, String cins, int yas) {
        this.isim = isim;
        this.cins = cins;
        this.yas = yas;
    }

    public void sesCıkarır(){
        System.out.println("Hayvan ses çıkarır.");
    }
}
//Bir üst sınıf ve bir alt sınıf oluşturun. Alt sınıf, üst sınıftan bir özelliği miras alsın ve bu özelliği ekrana yazdırsın.
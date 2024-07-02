package Day7.Task1;

abstract class Shape {
    public abstract double calculateArea(double r);
    public abstract double calculateArea(double k1, double k2);
}

/*
*Geometrik Şekiller*
   - Bir Shape (Şekil) sınıfı(parent) oluşturun ve bu sınıftan türeyen Circle (Daire) ve Rectangle (Dikdörtgen) sınıfları(child) tanımlayın.
   - Shape sınıfında calculateArea() metodunu soyut (abstract) olarak tanımlayın ve alt sınıflarda bu metodu implement edin.
   - Main metodunda farklı türde şekiller oluşturun (Shape referansıyla) ve her birinin alanını hesaplayarak ekrana yazdırın.
 */
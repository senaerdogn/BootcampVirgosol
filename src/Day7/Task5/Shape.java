package Day7.Task5;

public interface Shape {

    void calculateArea();
    void calculatePerimeter();

}
/*
*Task: Şekil Hesapları
   - Bir Shape (Şekil) interface'i tanımlayın ve bu interface içinde calculateArea() ve calculatePerimeter() gibi metodlar belirleyin.
   - Bu interface'i implement eden Circle, Rectangle gibi sınıflar oluşturun.
   - Her bir sınıfta interface'in metodlarını implement ederek, şekillerin alanını ve çevresini hesaplayın.
   - Main metodunda farklı türde şekiller (nesneler) oluşturun (Shape referansıyla) ve her birinin alanını ve çevresini hesaplayarak ekrana yazdırın.
 */
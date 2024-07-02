package Day7.Task6;

public interface Animal {
    void makeSound();
    void move();
}

/*
*Task: Hayvan Davranışları

   - Animal interface'i tanımlayın ve bu interface içinde makeSound() ve move() gibi metodlar belirleyin.
   - Bu interface'i implement eden Dog, Cat gibi sınıflar oluşturun.
   - Her bir sınıfta interface'in metodlarını implement ederek, hayvanların ses çıkarma ve hareket etme davranışlarını simüle edin.
   - Main metodunda farklı türde hayvanlar (nesneler) oluşturun (Animal referansıyla) ve her birinin ses çıkarma ve hareket etme metodlarını çağırarak sonuçları gözlemleyin.
 */
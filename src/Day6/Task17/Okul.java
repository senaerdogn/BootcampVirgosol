package Day6.Task17;

public class Okul {
    public String sinif;
    private char sube;

    public Okul(char sube) {
        this.sube = sube;
    }

    public char getSube() {
        return sube;
    }

    public void setSube(char sube) {
        this.sube = sube;
    }
}
//Bir sınıf oluşturun ve bu sınıfta private bir değişken tanımlayın. Bu değişkeni getter ve setter metodları ile güncelleyin ve ekrana yazdırın.
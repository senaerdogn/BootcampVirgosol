package Day6;

public class Task4 {
    String name = "Sena";
    public void smile(int decibel){
        System.out.println("İnsan " + decibel + " volume ile güler.");
    }

    public static void main(String[] args) {
        Task4 insan = new Task4();
        insan.smile(60);
    }
}
//Bir sınıf oluşturun ve bu sınıf içinde bir metot tanımlayın. Metot bir parametre alsın ve bu parametreyi ekrana yazdırsın.
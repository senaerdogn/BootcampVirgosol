package Day6;

public class Task9 {
    int number1;
    int number2;

    public void plusMethod(int number1, int number2){
        System.out.println(number1+number2);
    }

    public static void main(String[] args) {
        Task9 object = new Task9();
        object.number1 = 5;
        object.number2 = 14;
        object.plusMethod(object.number1, object.number2);
    }
}
//Bir sınıf oluşturun ve bu sınıfta iki değişken tanımlayın. Bu değişkenlerin toplamını bir metod içinde hesaplayın ve ekrana yazdırın.
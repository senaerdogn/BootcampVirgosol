package Day6;

public class Task6 {
    public void myMethod(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public void myMethod(double num1, double num2){
        System.out.println(num1 + num2);
    }

    public static void main(String[] args) {
        Task6 object = new Task6();
        object.myMethod(15,18);
        object.myMethod(4.5, 3.1);
    }
}
//Bir sınıf oluşturun ve bu sınıfta iki farklı metot tanımlayın.
//Bu metotlar aynı isme sahip olsun ama farklı parametreler alsın (overloading).
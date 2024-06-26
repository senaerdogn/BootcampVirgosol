package Day3;

public class Task2 {
    public static void main(String[] args) {
        int number=5, fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println(number+"!: " + fact);

    }
}
//Bir sayının faktöriyelini for döngüsü kullanarak hesaplayan bir Java programı yazın.
//Örneğin, 5'in faktöriyeli 120'dir.
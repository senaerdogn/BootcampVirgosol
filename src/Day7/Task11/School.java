package Day7.Task11;

public class School {
    public static String schoolName = "Çankaya Üniversitesi";
    public static boolean isFavorForBeingStudent(int age){
        if(age >= 6 && age <= 16){
            return true;
        }else {
            return false;
        }
    }
}
/*
*Task: static practice*
   - School isimli bir class oluşturun.
   - statik değişken olarak schoolName ataması yapın.
   - static bir method (isFavorForBeingStudent(int age)) tanımlayın.
   * Method parametre olarak yaş bilgisini alsın 6<= age <=16 yaşları arasında ise true değilse false dönen bir yapı kurun.
   - Başka bir java classından nesne yaratmadan statik değişken ve metoda erişelim.
 */
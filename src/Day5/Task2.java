package Day5;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
                26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75,
                76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

        int sum=0;
        double avg=0.0;
        for(int i: numbers){
            sum+=i;
        }
        avg = sum/numbers.length;
        System.out.println("Dizideki Elemanların Toplamı: " + sum);
        System.out.println("Dizi Ortalaması: "+ avg);

        int count=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>avg){
                count++;
            }
        }
        System.out.println("Dizi Ortalamasından Büyük Olan Kaç Sayı Vardır?: " + count);
    }
}
//100 adet rastgele sayının bulunduğu bir dizi oluşturun. Bu sayıların ortalamasını hesaplayın ve
//ortalamadan büyük olan sayıların kaç tane olduğunu bulun.
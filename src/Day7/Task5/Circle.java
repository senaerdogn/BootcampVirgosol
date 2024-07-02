package Day7.Task5;

public class Circle implements Shape{

    final double PI = 3.14;
    @Override
    public void calculateArea() {
        int r = 5;
        System.out.println("Yarıçapı " + r + " olan dairenin alanı = " + (PI * r * r));
    }

    @Override
    public void calculatePerimeter() {
        int r = 3;
        System.out.println("Yarıçapı " + r + " olan dairenin çevresi = " + (2 * PI * r));
    }

}

package Day7.Task1;

import Day7.Task1.Shape;

public class Circle extends Shape {

    final double PI = 3.14;

    @Override
    public double calculateArea(double r) {
        double area = PI * r * r;
        return area;
    }

    @Override
    public double calculateArea(double k1, double k2) {
        return 0;
    }
}

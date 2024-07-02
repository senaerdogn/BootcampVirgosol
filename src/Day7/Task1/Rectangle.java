package Day7.Task1;

import Day7.Task1.Shape;

public class Rectangle extends Shape {

    @Override
    public double calculateArea(double r) {
        return 0;
    }

    @Override
    public double calculateArea(double k1, double k2) {
        double area = k1 * k2;
        return area;
    }
}

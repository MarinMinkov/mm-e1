package Homework08;

public class E1 {

    static abstract class Shape
    {
        abstract double getArea(double num);
        abstract double getPerimeter(double num);
    }

    static class Circle extends Shape
    {
        @Override
        double getArea(double r)
        {
            return Math.PI * Math.pow(r,2);
        }

        @Override
        double getPerimeter(double r)
        {
            return 2 * Math.PI * r;
        }

    }

    static class Square extends Shape
    {
        @Override
        double getArea(double side) {
            return side * side;
        }

        @Override
        double getPerimeter(double side) {
            return side * 4;
        }
    }

    public static void main(String[] args) {

        Circle s1 = new Circle();
        System.out.println(s1.getArea(3.0));
        System.out.println(s1);

        Shape s2 = new Circle(); // Upcast Circle to Shape
        System.out.println(s2.getArea(3.0));
        System.out.println(s2);

        Circle s3 = (Circle) s2; // Downcast back to Circle
        System.out.println(s3);
        System.out.println(s3.getPerimeter(3.0));

//        Square s4 = new Shape();

        Square s5 = new Square();
        System.out.println(s5.getArea(6.0));
        System.out.println(s5.getPerimeter(6.0));


    }
}

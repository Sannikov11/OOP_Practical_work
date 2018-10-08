package com.company;
import com.company.Square;
import com.company.Circle;


public class Main {

    public static void main(String[] args) {

        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        s1.getArea(); // which version?
        s1.getPerimeter(); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        ((Circle) s1).getRadius();
        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        c1.getArea();
        c1.getPerimeter();
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        s3.getArea();
        s3.getPerimeter();
        System.out.println(s3.getColor());
        ((Rectangle) s3).getLenght();

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        r1.getArea();
        System.out.println(r1.getColor());
        double r2 = r1.getLenght();
        System.out.println("Length: "+r2);


        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        s4.getArea();
        System.out.println(s4.getColor());
        r2=((Square) s4).getSide();
        System.out.println("Side : " + r2);
// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r3 = (Rectangle)s4;
        System.out.println(r3);
        r3.getArea();
        System.out.println(r3.getColor());
        r3.getLenght();
        r3.getWidth();
        r3.toString();

// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r3;
        System.out.println(sq1);
        sq1.getArea();
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        sq1.toString();
    }
}

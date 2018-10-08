package com.company;
import com.company.Shape;

public class Circle extends Shape {
    public double radius;

    public  Circle(){};

    public Circle(double radius)
    {
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled)
    {
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void getArea() {
        System.out.println("Circle's area = " + 3.14*radius*radius);
    }

    @Override
    void getPerimeter() {
        System.out.println("Circle's perimeter = " + 2*3.14*radius);
    }

    @Override
    public String toString() {
        return ("Radius = " + radius + "\nColor: " + color +"\nFilled: " + filled);

    }
}


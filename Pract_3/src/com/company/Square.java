package com.company;
import com.company.Rectangle;

public class Square extends Rectangle {

    public double side;
    public Square(){};

    public Square(double side)
    {
        this.side = side;
    }

    public Square(double side, String color, boolean filled)
    {
        this.side=side;
        this.color=color;
        this.filled=filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    void getArea() {
        System.out.println("Square's area = " + side*side);
    }

    @Override
    void getPerimeter() {
        System.out.println("Square's perimeter = " + side*4);

    }
}

package com.company;
import com.company.Shape;

public class Rectangle extends Shape {
    public double width;
    public double lenght;
    public Rectangle()
    {};

    public Rectangle(double width, double lenght)
    {
        this.lenght=lenght;
        this.width=width;
    }

    public Rectangle(double width, double lenght, String color, boolean filled)
    {
        this.lenght=lenght;
        this.width=width;
        this.color=color;
        this.filled=filled;
    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    void getPerimeter() {

        System.out.println("Rectangle's perimeter = " + (width+lenght)*2);
    }

    @Override
    void getArea() {

        System.out.println("Rectangle's area = " + width*lenght);
    }

    @Override
    public String toString() {
        return ("Width = " + width +"\nLength = " + lenght + "\nColor: " + color +"\nFilled: " + filled);
    }
}

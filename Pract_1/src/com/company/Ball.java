package com.company;
import java.util.Scanner;

public class Ball {
    public String type;
    public int size;
    public String color;

    public Ball(String type, int size, String color)
    {
        this.type=type;
        this.color=color;
        this.size=size;
        //type=this.type;
        //size=this.size;
        //color=this.color;
    }

    public void setType(String type)
    {
        this.type=type;
    }
    public void setSize(int size)
    {
        this.size=size;
    }
    public void setColor()
    {
        System.out.print("Enter ball's color: ");
        Scanner sc =  new Scanner (System.in);
        color= sc.nextLine();
    }

    public String getType()
    {
        return type ;
    }
    public int getSize()
    {
        return size;
    }
    public String getColor()
    {

        return color;
    }

    public String toString()
    {
        return this.type + " ball\nSize: " + size + "\nColor: " + color;
    }

}

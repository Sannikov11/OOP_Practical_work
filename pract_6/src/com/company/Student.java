package com.company;

public class Student {
    public  int id;
    public  String name;

    public Student(){}

    public Student(int id, String name)
    {
        this.id=id;
        this.name=name;
    }

    public  String getStudent()
    {
        return (id + " " + name);
    }


}


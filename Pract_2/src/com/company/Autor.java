package com.company;

public class Autor {
    private String name;
    private String email;
    private char gender;

    public Autor(String name, String email, char gender)
    {
        this.email=email;
        this.gender=gender;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String toString() {
        return   name + " (" + gender + ") at " + email;
    }
}

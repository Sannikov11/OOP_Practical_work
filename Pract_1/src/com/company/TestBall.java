package com.company;
import com.company.Ball;

public class TestBall {

    public static void main(String[] args) {

        Ball baskBall= new Ball("Basketball",6,"Orange");
        System.out.println(baskBall.toString());
        baskBall.setColor();
        baskBall.setType("Football");
        baskBall.setSize(7);
        System.out.println(baskBall);
    }
}

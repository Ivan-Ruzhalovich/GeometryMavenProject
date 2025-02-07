package com.Ivan;

public class Rectangle {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double perimeter (){
        return 2 * (a + b);
    }

    public double area (){
        return a * b;
    }
}

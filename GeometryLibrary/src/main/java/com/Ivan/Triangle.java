package com.Ivan;

public class Triangle {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimeter (){
        return a + b + c;
    }

    public double area (){
        double p = (double) perimeter() /2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}

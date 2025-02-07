package com.Ivan;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double perimeter (){
        return 2 * Math.PI * radius;
    }

    public double area (){
        return Math.PI * Math.pow(radius,2);
    }

    public void update(){
        System.out.println("Внесение изменений, изменение версии на 1.1.0");
    }
}

package com.Ivan;

public class Sphere {
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double volumeOfSphere(){
        return Math.pow(radius,3) * ((double) 4 / 3);
    }
}

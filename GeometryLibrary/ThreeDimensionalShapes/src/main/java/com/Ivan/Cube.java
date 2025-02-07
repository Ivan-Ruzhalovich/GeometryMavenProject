package com.Ivan;

public class Cube {
    double a;

    public Cube(double a) {
        this.a = a;
    }

    public double volumeOfCube(){
        return Math.pow(a,3);
    }
}
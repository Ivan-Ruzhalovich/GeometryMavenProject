package com.Ivan;

public class Util {
    public static double centimeterToMillimeters (double centimeter){
        return centimeter * 10;
    }

    public static double radiusFromAreaOfCircle (double area){
        return Math.sqrt(area/Math.PI);
    }

    public static double radiusFromCircumference (double circumference){
        return circumference/(2 * Math.PI);
    }

}

package com.Ivan;
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,3,4);
        Circle circle = new Circle(20);
        Sphere sphere = new Sphere(30);
        Cube cube = new Cube(10);
        System.out.println("Периметр треугольника = " + triangle.perimeter());

        System.out.println("Площадь треугольника = " + triangle.area());

        System.out.println("Площадь окружности = " + circle.area());

        System.out.println("Длина окружности = " + circle.perimeter());

        System.out.println("Объем сферы = " + sphere.volumeOfSphere());

        System.out.println("Объем куба = " + cube.volumeOfCube());

        System.out.println("12 сантиметров = " + Utils.centimeterToMillimeters(12) + " миллиметров");

        System.out.println("Радиус окружности с площадью 56 = " + Utils.radiusFromAreaOfCircle(56));

        System.out.println("Радиус окружности с длиной окружности 33 = " + Utils.radiusFromCircumference(33));
    }
}
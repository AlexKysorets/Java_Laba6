package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle t1 = new Triangle(3,4,5);
        Triangle t2 = new Triangle(60,4,5,0);
        Triangle t3 = new Triangle(60, 45, 5, 0, 0);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println("Area of the triangle with three sides is: " + t1.getAreaWithSides());
        System.out.println("Area of the triangle with two sides and angle between them is: " + t2.getAreaWithAngle());
        System.out.println("The third side of the triangle with two sides and angle between them is: " + t2.cosineTheorem());
        System.out.println("The second side of the triangle with two angles and side between them is: " + t3.sineTheorem());
        System.out.println("The radius of the circle described around the triangle with three sides is: " + t1.getRadCircumscribed());
    }
}
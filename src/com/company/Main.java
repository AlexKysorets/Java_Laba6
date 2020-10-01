package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle first = new Triangle(5);
        Triangle second = new Triangle(4,90);
        Triangle third = new Triangle(4,5,6);

        System.out.println("Периметр рівностороннього трикутника дорівнює: " + first.getPerimeterEqualTriangle());
        System.out.println("Площа рівностороннього трикутника дорівнює: " + first.getAreaEqualTriangle());
        System.out.println("Висота рівностороннього трикутника (проведена до любої сторони) дорівнює: " + first.getHeightEqualTriangle());
        System.out.println("Радіус кола, описаного навколо рівностороннього трикутника дорівнює: " + first.getRadiusAroundEqualTriangle());
        System.out.println("");
        System.out.println("Гіпотенуза прямокутного трикутника дорівнює: " + second.getHypotenuse());
        System.out.println("Радіус кола, вписаного в прямокутний трикутник дорівнює: " + second.getRadiusInRectTriangle());
        System.out.println("Площа прямокутного трикутника дорівнює: " + second.getAreaRectTriangle());
        System.out.println("Радіус кола, описаного навколо прямокутного трикутника дорівнює: " + second.getRadiusAroundRectTriangle());
        System.out.println("");
        System.out.println("Площа будь якого іншого трикутника, який заданий трьома сторонами дорівнює: " + third.getAreaAnyTriangle());
        System.out.println("Висота трикутника, заданого трьома сторонами, в основі якої лежить сторона а дорівнює: " + third.getHeightAnyTriangle());
    }
}
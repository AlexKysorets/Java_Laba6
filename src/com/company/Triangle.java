/* Created by IntelliJ IDEA.
Laba6.Triangle 
@Autor: Alex
@DateTime: 28.09.2020|20:21 
@Version Triangle: 1.0
*/

package com.company;

import java.util.Objects;

public class Triangle {
    private int aSide;
    private int bSide;
    private int cSide;

    private int side;

    private int leg;
    private int angle;

    public Triangle() {
    }

    public Triangle(int side) {
        // рівносторонній трикутник
        this.side = side;
    }

    public Triangle(int leg, int angle) {
        // прямокутний трикутник
        this.leg = leg;
        this.angle = angle;
    }

    public Triangle(int aSide, int bSide, int cSide) {
        // будь який інший трикутник, у якого всі сторони різні
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    public int getaSide() {
        return aSide;
    }

    public void setaSide(int aSide) {
        this.aSide = aSide;
    }

    public int getbSide() {
        return bSide;
    }

    public void setbSide(int bSide) {
        this.bSide = bSide;
    }

    public int getcSide() {
        return cSide;
    }

    public void setcSide(int cSide) {
        this.cSide = cSide;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return aSide == triangle.aSide &&
                bSide == triangle.bSide &&
                cSide == triangle.cSide &&
                side == triangle.side &&
                leg == triangle.leg &&
                angle == triangle.angle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aSide, bSide, cSide, side, leg, angle);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "aSide=" + aSide +
                ", bSide=" + bSide +
                ", cSide=" + cSide +
                ", side=" + side +
                ", leg=" + leg +
                ", angle=" + angle +
                '}';
    }

    // функції для рівностороннього трикутника

    // периметр
    public int getPerimeterEqualTriangle() {
        return 3 * this.getSide();
    }

    // площа
    public double getAreaEqualTriangle() {
        return Math.pow(this.getSide(), 2) * Math.sqrt(3) / 4;
    }

    //висота
    public double getHeightEqualTriangle() {
        double area = getAreaEqualTriangle();
        return 2 * area / this.getSide();
    }

    // радіус кола описаного навколо рівностороннього трикутника
    public double getRadiusAroundEqualTriangle() {
        return this.getSide() / Math.sqrt(3);
    }

    // функції для прямокутного трикутника

    // гіпотенуза
    public double getHypotenuse() {
        return Math.sqrt(Math.pow(this.getLeg(), 2) * 2);
    }

    // радіус кола вписаного в прямокутний трикутник
    public double getRadiusInRectTriangle() {
        double hypotenuse = getHypotenuse();
        return (this.getLeg() * 2 - hypotenuse) / 2;
    }

    // площа
    public double getAreaRectTriangle() {
        return Math.pow(this.getLeg(), 2) / 2;
    }

    // радіус кола описаного навколо прямокутного трикутника
    public double getRadiusAroundRectTriangle() {
        double hypotenuse = getHypotenuse();
        return hypotenuse / 2;
    }

    // функції для будь якого іншого трикутника

    // площа
    public double getAreaAnyTriangle() {
        double halfPerimeter = (this.getaSide() + this.getbSide() + this.getcSide()) / 2;
        return Math.sqrt(halfPerimeter *
                (halfPerimeter - this.getaSide()) *
                (halfPerimeter - this.getbSide()) *
                (halfPerimeter - this.getcSide()));
    }

    // висота в основі якої лежить сторона а
    public double getHeightAnyTriangle() {
        double area = getAreaAnyTriangle();
        return 2 * area / this.getaSide();
    }
}

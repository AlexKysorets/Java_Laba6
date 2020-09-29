/* Created by IntelliJ IDEA.
Laba6.Triangle 
@Autor: Alex
@DateTime: 28.09.2020|20:21 
@Version Triangle: 1.0
*/

package com.company;

import javax.swing.text.MutableAttributeSet;
import java.util.Objects;

public class Triangle {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    private int angleBetweenSides;
    private int leftSide;
    private int rightSide;

    private int firstAngle;
    private int secondAngle;
    private int sideBetweenAngles;

    public Triangle() {
    }

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public Triangle(int angleBetweenSides, int leftSide, int rightSide, int someVar) {
        this.angleBetweenSides = angleBetweenSides;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    public Triangle(int firstAngle, int secondAngle, int sideBetweenAngles, int someVar1, int someVar2) {
        this.firstAngle = firstAngle;
        this.secondAngle = secondAngle;
        this.sideBetweenAngles = sideBetweenAngles;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
                ", angleBetweenSides=" + angleBetweenSides +
                ", leftSide=" + leftSide +
                ", rightSide=" + rightSide +
                ", firstAngle=" + firstAngle +
                ", secondAngle=" + secondAngle +
                ", sideBetweenAngles=" + sideBetweenAngles +
                '}';
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(int thirdSide) {
        this.thirdSide = thirdSide;
    }

    public int getAngleBetweenSides() {
        return angleBetweenSides;
    }

    public void setAngleBetweenSides(int angleBetweenSides) {
        this.angleBetweenSides = angleBetweenSides;
    }

    public int getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(int leftSide) {
        this.leftSide = leftSide;
    }

    public int getRightSide() {
        return rightSide;
    }

    public void setRightSide(int rightSide) {
        this.rightSide = rightSide;
    }

    public int getFirstAngle() {
        return firstAngle;
    }

    public void setFirstAngle(int firstAngle) {
        this.firstAngle = firstAngle;
    }

    public int getSecondAngle() {
        return secondAngle;
    }

    public void setSecondAngle(int secondAngle) {
        this.secondAngle = secondAngle;
    }

    public int getSideBetweenAngles() {
        return sideBetweenAngles;
    }

    public void setSideBetweenAngles(int sideBetweenAngles) {
        this.sideBetweenAngles = sideBetweenAngles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return firstSide == triangle.firstSide &&
                secondSide == triangle.secondSide &&
                thirdSide == triangle.thirdSide &&
                angleBetweenSides == triangle.angleBetweenSides &&
                leftSide == triangle.leftSide &&
                rightSide == triangle.rightSide &&
                firstAngle == triangle.firstAngle &&
                secondAngle == triangle.secondAngle &&
                sideBetweenAngles == triangle.sideBetweenAngles;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstSide, secondSide, thirdSide, angleBetweenSides, leftSide, rightSide, firstAngle, secondAngle, sideBetweenAngles);
    }

    public double getAreaWithSides() {
        double halfPerimeter = (this.getFirstSide() +
                this.getSecondSide() + this.getThirdSide());
        return (Math.sqrt(halfPerimeter * (halfPerimeter - this.getFirstSide()) *
                (halfPerimeter - this.getSecondSide()) *
                (halfPerimeter - this.getThirdSide())));
    }

    public double getAreaWithAngle() {
        return (this.getLeftSide() * this.getRightSide() * 0.5 * Math.sin(this.angleBetweenSides * Math.PI / 180));
    }

    public double cosineTheorem() {
        return (Math.sqrt(Math.pow(this.getLeftSide(), 2) +
                Math.pow(this.getRightSide(), 2) - 2 * this.getLeftSide() *
                this.getRightSide() * Math.cos(this.getAngleBetweenSides() * Math.PI / 180)));
    }

    public double sineTheorem() {
        int thirdAngle = 180 - (this.getFirstAngle() + this.getSecondAngle());
        return ((Math.sin(this.getSecondAngle() * Math.PI / 180) * this.getSideBetweenAngles()) /
                Math.sin(thirdAngle * Math.PI / 180));
    }

    public double getRadCircumscribed() {
        double area = getAreaWithSides();
        return ((this.getFirstSide() * this.getSecondSide() * this.getThirdSide() /
                (4 * area)));
    }
}

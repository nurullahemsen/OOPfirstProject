package com.dankSide;

public class Circle implements Shape{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius *radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle radius = %.2f area = %.2f perimeter %.2f",
                this.radius,this.calculateArea(),this.calculatePerimeter());
    }
}

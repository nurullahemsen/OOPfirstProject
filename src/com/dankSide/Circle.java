package com.dankSide;

public class Circle implements Shape{
    double radius;
    private double x;
    private double y;

    public Circle(double radius,double x, double y){
        this.radius = radius;
        this.x = x;
        this.y = y;
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
        return String.format("Circle(%.0f, %.0f) radius = %.2f area = %.2f perimeter %.2f",
                this.x,this.y,this.radius,this.calculateArea(),this.calculatePerimeter());
    }
}

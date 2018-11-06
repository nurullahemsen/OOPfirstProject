package com.dankSide;

public class Rectangle implements Shape{

    private double width;
    private double height;
    private double x;
    private double y;

    public Rectangle(double width,double height,double x, double y){
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public String toString() {
        return String.format("Rectangle width = %.2f height = %.2f area = %.2f perimeter %.2f",
                this.width,this.height,this.calculateArea(),this.calculatePerimeter());
    }
}
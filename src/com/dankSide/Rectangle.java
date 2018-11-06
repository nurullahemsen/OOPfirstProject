package com.dankSide;

public class Rectangle implements Shape{

    private double width;
    private double height;

    public Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
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
package com.dankSide;

public class Square extends Rectangle{

    public Square(double width,double x, double y){
        super(width,width,x,y);
    }

    @Override
    public String toString() {
        return String.format("Square(%.0f, %.0f) width = %.2f area = %.2f perimeter %.2f",
                super.getX(),super.getY(),super.getWidth(),this.calculateArea(),this.calculatePerimeter());
    }
}

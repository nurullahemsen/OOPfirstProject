package com.dankSide;

public class Square extends Rectangle{

    public Square(double width){
        super(width,width);
    }

    @Override
    public String toString() {
        return String.format("Square width = %.2f area = %.2f perimeter %.2f",
                super.getWidth(),this.calculateArea(),this.calculatePerimeter());
    }
}

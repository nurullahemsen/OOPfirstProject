package com.dankSide;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Nurullah EMSEN
 *            Elifnaz ÖKLÜ
 *            Oğuzhan KATI
 */

public class Main {

    static Shape[] array = new Shape[100];

    public static void main(String[] args) {

        try{
            readText();
        }catch (FileNotFoundException e){
            System.out.println("exception");
        }
        ArrayIterator<Shape> iter = new ArrayIterator<>(array);
        while(iter.hasNext()) System.out.println(iter.next());
    }

    public static void readText() throws FileNotFoundException {
        String[] s;
        int index = 0;
        Scanner sc = new Scanner(new File("Shapes.txt"));
        while (sc.hasNextLine()){
            s = sc.nextLine().split(" ");
            if(s[0].equals("Rectangle")){
                double[] coordinates = getCoordinates(s[1]);
                array[index++] = new Rectangle(Double.parseDouble(s[2]),
                        Double.parseDouble(s[3]),coordinates[0],coordinates[1]);
            }
            else if(s[0].equals("Square")){
                double[] coordinates = getCoordinates(s[1]);
                array[index++] = new Square(Double.parseDouble(s[2]),coordinates[0],coordinates[1]);
            }
            else if(s[0].equals("Circle")){
                double[] coordinates = getCoordinates(s[1]);
                array[index++] = new Circle(Double.parseDouble(s[2]),coordinates[0],coordinates[1]);
            }
        }
    }
    private static double[] getCoordinates(String s){
        double[] coordinates = new double[2];
        String newString = "";
        for(int i = 1; i < s.length() - 1; i++){
            newString = newString + s.charAt(i);
        }
        coordinates[0] = Double.parseDouble(newString.split(",")[0]);
        coordinates[1] = Double.parseDouble(newString.split(",")[1]);
        return coordinates;
    }
}

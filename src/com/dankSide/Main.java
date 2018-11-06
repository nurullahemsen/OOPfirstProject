package com.dankSide;

import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Rectangle(5,2));
        //String[] sarr = {"hello"," world!"};
        String[] sarr = new String[50];
        sarr[25] = "hello";
        sarr[30] = " world!";
        sarr[49] = "...";
        ArrayIterator iter = new ArrayIterator<String>(sarr);
//        while (iter.hasNext()) System.out.print(iter.next());
        //System.out.println(sarr[3]);
        System.out.print(iter.next());
        System.out.print(iter.next());
        System.out.print(iter.next());
        try {
            System.out.print(iter.next());
        }catch (NoSuchElementException e){
            System.out.println("cacthed");
        }
        System.out.println(iter.hasNext());
    }
}

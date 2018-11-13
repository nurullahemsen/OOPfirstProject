package com.dankSide;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<E> implements Iterator<E> {
    private E[] arr;
    private int index;
    private int size;

    public ArrayIterator(E[] arr){
        this.arr = arr;
        this.index = 0;
        this.size = arr.length;
    }

    public E[] getArr() {
        return arr;
    }

    public void setArr(E[] arr) {
        this.arr = arr;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private void nextItem(){

        E instance =  arr[index];
        if (instance != null) return;
        else while(++index < size){
            instance = arr[index];
            if (instance != null) return;
        }
    }

    public E next(){
        if (index == size) throw new NoSuchElementException("No next item avaliable");
        nextItem();
        E instance =  arr[index++];
        return instance;
    }

    @Override
    public boolean hasNext() {
        int relativeIndex = this.index;
        if (relativeIndex == size) return false;
        E instance = arr[relativeIndex];
        if (instance == null){
            while(++relativeIndex < size){
                instance = arr[relativeIndex];
                if (instance != null) return true;
            }
            return false;
        }
        else return true;
    }
}

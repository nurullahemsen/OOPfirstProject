package com.dankSide;

import static org.junit.Assert.*;

/**
 * Created by Elifnaz on 7.11.2018.
 */
public class ArrayIteratorTest {
    @org.junit.Test
    public void next() throws Exception {
        String[] testingList = new String[50];
        testingList[25] = "hello";
        testingList[30] = " world!";
        testingList[49] = "...";
        ArrayIterator iter = new ArrayIterator<String>(testingList);
        assertNotNull("next() fonksiyonu null obje döndüremez",iter.next());

    }

    @org.junit.Test
    public void hasNext() throws Exception {
        String[] testingList = new String[50];
        testingList[25] = "hello";
        testingList[30] = " world!";
        testingList[49] = "...";
        ArrayIterator iter = new ArrayIterator<String>(testingList);
        iter.setIndex(testingList.length);
        assertFalse("Listenin sonuna gelindiğinde hasNext() false çıktısı" +
                "vermeli",iter.hasNext());
        iter.setIndex(0);
    }

}
package com.fsk.onetechnicnquestions.binarysearchalgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main1Test {

    @Test
    void binarySearch() {

        //2, 3, 4, 5, 6, 7
        int[] arr = new int[] {4, 7, 3, 5, 2, 6};
        int target = 7;
        int actual = Main1.binarySearch(arr, target);
        assertEquals(5, actual);

    }

    @Test
    void binarySearch2() {

        int a = 10;
        int b = 20;
        int actual = Main1.binarySearch2(a, b);
        int expected = 30;
        assertEquals(expected, actual);

    }


    @Test
    void binarySearch3() {
        int a = 16;
        boolean actualValue = Main1.binarySearch3(a);
        assertTrue(actualValue);
    }

    @Test
    void binarySearch3_test2() {
        int a = 17;
        boolean actualValue = Main1.binarySearch3(a);
        assertFalse(actualValue);
    }

    @Test
    void binarySearch4_test1() {
        int[] arr = new int[]{0,2,1,0};
        int output = Main1.binarySearch4(arr);
        assertEquals(1, output);
    }

    @Test
    void binarySearch4_test2() {
        int[] arr = new int[]{0,1,0};
        int output = Main1.binarySearch4(arr);
        assertEquals(1, output);
    }
}
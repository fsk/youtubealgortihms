package com.fsk.onequestiontechnic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main1Test {

    @Test
    void containsDuplicate() {
        int[] arr = {1, 2, 3, 4, 5, 2};
        boolean expected = Main1.containsDuplicate(arr);
        assertTrue(expected);
    }


    @Test
    void containsDuplicate_test2() {
        int[] arr = {1, 2, 3, 4, 5};
        boolean expected = Main1.containsDuplicate(arr);
        assertFalse(expected);
    }

    @Test
    void containsDuplicate2() {
        int[] arr = {1, 2, 3, 4, 5};
        boolean expected = Main1.containsDuplicate2(arr);
        assertFalse(expected);
    }

    @Test
    void containsDuplicate2_test2() {
        int[] arr = {1, 2, 3, 4, 5, 2};
        boolean expected = Main1.containsDuplicate2(arr);
        assertTrue(expected);
    }

    @Test
    void containsDuplicate3() {
        int[] arr = {1, 2, 3, 4, 5, 2};
        boolean expected = Main1.containsDuplicate3(arr);
        assertTrue(expected);
    }

    @Test
    void containsDuplicate3_test2() {
        int[] arr = {1, 2, 3, 4, 5};
        boolean expected = Main1.containsDuplicate3(arr);
        assertFalse(expected);
    }

    @Test
    void containsDuplicate4() {
        int[] arr = {1, 2, 3, 4, 5};
        boolean expected = Main1.containsDuplicate4(arr);
        assertFalse(expected);
    }


    @Test
    void containsDuplicate4_test2() {
        int[] arr = {1, 2, 3, 4, 5, 2};
        boolean expected = Main1.containsDuplicate4(arr);
        assertTrue(expected);
    }
}
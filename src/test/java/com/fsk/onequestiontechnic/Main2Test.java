package com.fsk.onequestiontechnic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main2Test {

    @Test
    void isPerfectSquare1_test1() {

        int number = 16;
        boolean actualValue = Main2.isPerfectSquare1(number);
        assertTrue(actualValue);
    }

    @Test
    void isPerfectSquare1_test2() {

        int number = Integer.MAX_VALUE - 1;
        boolean actualValue = Main2.isPerfectSquare1(number);
        assertFalse(actualValue);
    }

    @Test
    void isPerfectSquare2_test1() {
        int number = 16;
        boolean actualValue = Main2.isPerfectSquare1(number);
        assertTrue(actualValue);
    }

    @Test
    void isPerfectSquare2_test2() {

        int number = Integer.MAX_VALUE - 1;
        boolean actualValue = Main2.isPerfectSquare1(number);
        assertFalse(actualValue);
    }

    @Test
    void isPerfectSquare3_test1() {
        int number = 16;
        boolean actualValue = Main2.isPerfectSquare3(number);
        assertTrue(actualValue);
    }

    @Test
    void isPerfectSquare3_test2() {
        int number = 15;
        boolean actualValue = Main2.isPerfectSquare3(number);
        assertFalse(actualValue);
    }

    @Test
    void isPerfectSquare4_test1() {
        int number = 15;
        boolean actualValue = Main2.isPerfectSquare4(number);
        assertFalse(actualValue);
    }

    @Test
    void isPerfectSquare4_test2() {
        int number = 16;
        boolean actualValue = Main2.isPerfectSquare4(number);
        assertTrue(actualValue);
    }

    @Test
    void isPerfectSquare5_test1() {

        int number = 16;
        boolean actualValue = Main2.isPerfectSquare5(number);
        assertTrue(actualValue);
    }

    @Test
    void isPerfectSquare5_test2() {

        int number = 15;
        boolean actualValue = Main2.isPerfectSquare5(number);
        assertFalse(actualValue);
    }
}
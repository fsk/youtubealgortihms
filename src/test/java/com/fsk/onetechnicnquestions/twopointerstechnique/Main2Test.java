package com.fsk.onetechnicnquestions.twopointerstechnique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main2Test {

    @Test
    void twoPointerTechniqueIsPalindrome() {

        String input = "kazak".toLowerCase();

        boolean actualValue = Main2.twoPointerTechniqueIsPalindrome(input);
        boolean expectedValue = true;

        assertEquals(expectedValue, actualValue);

    }

    @Test
    void twoPointerTechniqueIsPalindrome_test2() {

        String input = "adanada".toLowerCase();

        boolean actualValue = Main2.twoPointerTechniqueIsPalindrome(input);

        assertTrue(actualValue);

    }


    @Test
    void twoPointerTechniqueIsPalindrome_test3() {

        String input = "ankara".toLowerCase();

        boolean actualValue = Main2.twoPointerTechniqueIsPalindrome(input);

        assertFalse(actualValue);

    }
}
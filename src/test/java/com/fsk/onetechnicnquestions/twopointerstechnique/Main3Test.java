package com.fsk.onetechnicnquestions.twopointerstechnique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main3Test {

    @Test
    void twoPointerTechniqueContainerWithMostWater() {

        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        int actual = Main3.twoPointerTechniqueContainerWithMostWater(arr);
        assertEquals(expected, actual);

    }
}
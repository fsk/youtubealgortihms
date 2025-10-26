package com.fsk.onetechnicnquestions.twopointerstechnique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main1Test {

    @Test
    void twoPointerTechnique() {

        int[] arr = new int[]{3, 5, 8, 4, 13, 6 ,1};
        int target = 12;
        int[] result = Main1.twoPointerTechnique(arr, target);

        assertArrayEquals(new int[]{4, 8}, result);

    }
}
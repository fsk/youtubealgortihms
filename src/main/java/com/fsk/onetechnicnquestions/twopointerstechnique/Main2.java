package com.fsk.onetechnicnquestions.twopointerstechnique;

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
    }

    public static boolean twoPointerTechniqueIsPalindrome(String str) {
        int leftPointer = 0;
        int rightPointer = str.length() - 1;
        while (leftPointer < rightPointer) {
            if (str.charAt(leftPointer) != str.charAt(rightPointer)) return false;
            leftPointer++;
            rightPointer--;
        }

        return true;
    }
}

package com.fsk.onetechnicnquestions.twopointerstechnique;

import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {

    }

    public static int[] twoPointerTechnique(int[] arr, int target) {

        //sort this array
        Arrays.sort(arr);

        //select pointers
        int leftPointer = 0;
        int rightPointer = arr.length - 1;

        while (leftPointer < rightPointer) {
            int sum = arr[leftPointer] + arr[rightPointer];

            if (sum == target) {
                return new int[]{arr[leftPointer], arr[rightPointer]};
            }else if (sum < target) {
                leftPointer++;
            }else {
                rightPointer--;
            }
        }

        return new int[]{};

    }
}

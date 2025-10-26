package com.fsk.onetechnicnquestions.twopointerstechnique;

public class Main3 {

    public static void main(String[] args) {

    }


    public static int twoPointerTechniqueContainerWithMostWater(int[] heightArray) {

        int leftPointer = 0;
        int rightPointer = heightArray.length - 1;
        int max = 0;

        while (leftPointer < rightPointer) {

            int height = Math.min(heightArray[leftPointer], heightArray[rightPointer]);
            int width = rightPointer - leftPointer;
            int area = height * width;
            max = Math.max(max, area);

            if (heightArray[leftPointer] < heightArray[rightPointer]) {
                leftPointer++;
            }else {
                rightPointer--;
            }
        }

        return max;

    }
}

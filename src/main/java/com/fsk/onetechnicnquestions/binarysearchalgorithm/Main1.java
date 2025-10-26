package com.fsk.onetechnicnquestions.binarysearchalgorithm;

import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {
        System.out.println(binarySearch2(Integer.MAX_VALUE - 1, Integer.MIN_VALUE + 100));
    }

    public static int binarySearch(int[] arr, int target) {

        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            }else if (arr[mid] < target) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch2(int a, int b) {

        int min  = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (mid == (a + b)) return mid;
            else if (mid < (a + b)) min = mid + 1;
            else max = mid - 1;
        }
        return -1;
    }

    public static boolean binarySearch3(int a) {
        int start = 1;
        int end = a;

        while (start <= end) {

            int mid = (start + end) / 2;
            if (mid * mid == a) return true;
            else if (mid * mid < a) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }

    public static int binarySearch4(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }else {
                high = mid;
            }
        }

        return low;
    }





















}

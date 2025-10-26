package com.fsk.onequestiontechnic;

/**
 * Bir sayinin tam kare (perfect square)
 * olup olmadıgını bulan program
 * 16 -> 4
 * 25 -> 5
 * 121 -> 11
 * 27 -> X
 * 40 -> X
 */

public class Main2 {

    public static void main(String[] args) {

        System.out.println(isPerfectSquare1(999999989));

    }

    //linear search
    public static boolean isPerfectSquare1(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && num / i == i) {
                return true;
            }
        }
        return false;
    }

    //number theories - 1
    public static boolean isPerfectSquare2(int num) {
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0 && num / i == i) {
                return true;
            }
        }
        return false;
    }

    //number theories - 2
    //Farkların Toplamı
    public static boolean isPerfectSquare3(int num) {
        int odd = 1;
        while (num > 0) {
            num = num - odd;
            odd = odd + 2;
        }

        return num == 0;
    }

    //number theories - 3 Newton Method
    public static boolean isPerfectSquare4(int num) {
        if (num < 2) return true;
        long x = num / 2;
        while (x * x > num) {
            x = (x + num / x) / 2;
        }
        return x * x == num;
    }

    //Binary Search Algoritması
    public static boolean isPerfectSquare5(int num) {
        long start = 1;
        long end = num;
        while (start <= end) {
            long mid = start + ((end - start)) / 2;
            if (mid * mid == num) return true;
            else if (mid * mid < num) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }


}

package com.fsk.onequestiontechnic;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Array
 * butun elemanlar farkliysa false
 * eger herhangi iki eleman ayniysa true
 */

public class Main1 {

    public static void main(String[] args) {

    }


    public static boolean containsDuplicate(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] arr) {
        if (arr.length == 1) return false;
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        return arr.length != set.size();

    }

    public static boolean containsDuplicate3(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num, 1);
        }
        return false;
    }

    public static boolean containsDuplicate4(int[] arr) {
        return IntStream
                .of(arr)
                .boxed()
                .collect(Collectors.toSet())
                .size() != arr.length;
    }

}

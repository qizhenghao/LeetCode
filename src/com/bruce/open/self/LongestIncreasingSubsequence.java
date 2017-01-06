package com.bruce.open.self;

/**
 * Created by qizhenghao on 17/1/5.
 */
public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

        int[] arr = {
                5, 3, 4, 8, 6, 7, 8, 9, 11, 3
        };

        int maxLength = 0, currLength = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1]) {
                currLength++;
            } else {
                if (maxLength < currLength)
                    maxLength = currLength;
                currLength = 1;
            }
        }

        System.out.println(maxLength);
    }


}

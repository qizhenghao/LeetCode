package com.bruce.open.self;

import java.util.Arrays;

/**
 * Created by qizhenghao on 17/5/10.
 */
public class BubbleSort {

    public static void main(String[] args) {

//        int[] arr = new int[]{3, 4, 4, 1, 2, 6, 5};
        int[] arr = new int[]{4,8,2,7,5, 6, 1, 3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return;
        int length = arr.length;
        int time = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                    time++;
                }
            }
        }
        System.out.println(time);
    }

}

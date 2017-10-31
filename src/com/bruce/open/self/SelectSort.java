package com.bruce.open.self;

import java.util.Arrays;

/**
 * Created by qizhenghao on 17/5/10.
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 4, 1, 2, 6, 5};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return;
        int length = arr.length, temp;

        for (int i = 0; i < length; i++) {
            int k = i;
            for (int j = i+1; j < length; j++) {
                if (arr[k] > arr[j])
                    k = j;
            }
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
    }
}

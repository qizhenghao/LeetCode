package com.bruce.open.self;

import java.util.Arrays;

/**
 * Created by qizhenghao on 16/12/26.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3, 3, 2, 1, 1, 5, 5, 4, 3, 3, 4};

        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;
        int i = start-1, j = end, key = arr[end];
        while (true) {
            while (key < arr[--j])
                if (j == start)
                    break;
            while (key > arr[++i]);
            if (i >= j) break;
            swap(arr, i, j);
        }
        swap(arr, i, end);
        quickSort(arr, start, i - 1);
        quickSort(arr, i + 1, end);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

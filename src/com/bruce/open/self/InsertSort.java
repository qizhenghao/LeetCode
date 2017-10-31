package com.bruce.open.self;

        import java.util.Arrays;

/**
 * Created by qizhenghao on 17/5/10.
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 4, 1, 2, 6, 5};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return;

        int j, temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            for (j = i; j > 0 && temp < arr[j-1]; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }
}

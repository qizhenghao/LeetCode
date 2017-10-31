package com.bruce.open.self;

        import java.util.Arrays;

/**
 * Created by qizhenghao on 17/5/10.
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 4, 1, 2, 6, 5};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shellSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return;

        int j, temp;
        for (int increment = arr.length/2; increment > 0; increment/=2) {
            for (int i = increment; i < arr.length; i++) {
                temp = arr[i];
                for (j = i; j >= increment && temp < arr[j-increment]; j-=increment) {
                    arr[j] = arr[j - increment];
                }
                arr[j] = temp;
            }
        }
    }
}

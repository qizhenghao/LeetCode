package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/19.
 */
public class UglyNumber {

    public static void main(String[] args) {

        System.out.println(isUgly(16) + "");
        System.out.println(isUgly(50) + "");
        System.out.println(isUgly(180) + "");

        System.out.println(getN_th(15));
        System.out.println(getN_th_new(15));
        System.out.println(getN_th_new(1500));
    }

    private static boolean isUgly(int num) {
        if (num < 1)
            return false;
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }

    //计算第N个丑数，很耗时
    private static int getN_th(int n) {
        int time = 3, i = 3;
        if (n < 4)
            return n;
        while (time < n) {
            i++;
            if (isUgly(i)) {
                time++;
                System.out.print(i + " ");
            }
        }
        return i;
    }


    //以空间换时间
    private static int getN_th_new(int n) {
        if (n < 4)
            return n;
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        int two, three, five, j;
        for (int i = 2; i < n - 1; i++) {

            j = 0;
            while (arr[j] * 2 <= arr[i])
                j++;
            two = arr[j] * 2;

            j = 0;
            while (arr[j] * 3 <= arr[i])
                j++;
            three = arr[j] * 3;

            j = 0;
            while (arr[j] * 5 <= arr[i])
                j++;
            five = arr[j] * 5;

            arr[i + 1] = Math.min(Math.min(two, three), five);
        }
        return arr[n - 1];
    }

}

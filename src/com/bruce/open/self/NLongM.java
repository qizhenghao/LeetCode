package com.bruce.open.self;

/**
 * Created by qizhenghao on 17/5/11.
 *
 * 题目：
 有一个长为n的数列a0,a1,...,an-1。请求出这个序列中最长的上升子序列的长度。
 上升子序列指的是对于仍以的 i<j 都满足ai<aj 的子序列。1 <= n <= 1000 ,0<= ai <= 1000000。
 输入样例：
 5 4 2 3 1 5
 输出样例:
 3 (a1,a2,a4构成子序列2,3,5最长)
 */
public class NLongM {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 2, 3, 1, 5};
        System.out.println(getNLongM(arr));
    }

    private static int getNLongM(int[] arr) {
        int[] len = new int[arr.length];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            len[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    len[i] = Math.max(len[i], len[j] + 1);
                }
                max = Math.max(max, len[i]);
            }
        }
        return max;
    }
}

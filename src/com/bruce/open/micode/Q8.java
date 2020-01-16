package com.bruce.open.micode;

/**
 * Created by qizhenghao on 17/10/30.
 * 描述
 * <p>
 * 给出一个无序数列，每次只能交换相邻两个元素，求将原数列变成递增数列的最少交换次数。
 * 如：数列：2,3,1，交换3和1后变成：2,1,3；交换1和2之后变成：1,2,3。总共交换2次。
 * 输入
 * <p>
 * 逗号隔开的正整数数列
 * 输出
 * <p>
 * 正整数
 */

public class Q8 {

    public static void main(String[] args) {

//        System.out.println(solution("4 8 2 7 5 6 1 3"));
        System.out.println(solution("2,3,1"));
    }

    private static String solution(String line) {
        // 在此处理单行数据
        String[] arrStr = line.split(",");
        int[] arr = new int[arrStr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(arrStr[i]);
        }
        int time = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                    time++;
                }
            }
        }

        // 返回处理后的结果
        return String.valueOf(time);
    }
}

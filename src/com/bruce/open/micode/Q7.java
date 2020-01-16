package com.bruce.open.micode;

import java.util.HashMap;

/**
 * 描述
 * <p>
 * 给出一个无序的数组，找出其中缺失的第一个正数，要求时间复杂度为 O(n)
 * 如：[1,2,0]，第一个缺失为3。
 * 如：[3,4,-1,1]，第一个缺失为2。
 * 输入
 * <p>
 * 1,2,0
 * 输出
 * <p>
 * 3
 */

public class Q7 {

    public static void main(String[] args) {

        System.out.println(solution1("1,2,0"));
        System.out.println(solution1("3,4,5,8,-1,-2,2,1"));
        System.out.println(solution1("-1,-3,-5"));
        System.out.println(solution1("1,2,3,4,5,6,7,8,9"));
        System.out.println(solution1("-1,-10,0,1,9,2,5,8,7,6"));

        System.out.println(solution2("1,2,0"));
        System.out.println(solution2("3,4,5,8,-1,-2,2,1"));
        System.out.println(solution2("-1,-3,-5"));
        System.out.println(solution2("1,2,3,4,5,6,7,8,9"));
        System.out.println(solution2("-1,-10,0,1,9,2,5,8,7,6"));

    }

    private static String solution1(String line) {
        String[] strArray = line.split(",");

        int min = 1, max = 0, n;
        HashMap<Integer, Integer> map = new HashMap<>(strArray.length*4/3+1);
        for (int i = 0; i < strArray.length; i++) {
            n = Integer.valueOf(strArray[i]);
            if (n < min)
                continue;
            if (n > max)
                max = n;
            map.put(n, i);
        }

        if ((max - min + 1) == map.size())
            return String.valueOf(max + 1);

        for (int i = 1; i < max; i++) {
            if (map.get(i) == null)
                return String.valueOf(i);
        }

        return String.valueOf(1);
    }

    private static String solution2(String line) {
        String[] strArray = line.split(",");
        int[] numArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            numArray[i] = Integer.valueOf(strArray[i]);
        }
        for (int i = 0; i < numArray.length; ) {
            if (numArray[i] > 0 && numArray[i] <= numArray.length && numArray[i] != numArray[numArray[i] - 1]) {
                int index = numArray[i];
                numArray[i] = numArray[index - 1];
                numArray[index - 1] = index;
            } else {
                i++;
            }
        }
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] != i + 1) {
                return String.valueOf(i + 1);
            }
        }
        return String.valueOf(numArray.length + 1);
    }
}

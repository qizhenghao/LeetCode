package com.bruce.open.self;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/1/4 0004.
 */
public class Sohu_FindMaxNum {

    public static void main(String[] args) {

//        System.out.println(findMaxNum(7938265, 3));
//        System.out.println(findMaxNum(37938265, 3));
//        System.out.println(findMaxNum(437893826, 3));
//
//        System.out.println(findMaxNum(7938265, 2));
        System.out.println(findMaxNum(37938265, 4));
        System.out.println(findMaxNum("37938265", 4));
        System.out.println(findMaxNum(437893826, 4));
        System.out.println(findMaxNum("437893826", 4));

    }

    public static int findMaxNum(int origin, int n) {
        int originTemp = origin, size = sizeOfInt(origin);
        int[] resultArr = new int[size - n], originArr = new int[size];
        for (int i = size-1; i >= 0; i--) {
            originArr[i] = originTemp % 10;
            originTemp /= 10;
        }
        int result = 0, removeCount = 0, resultIndex = 0, i = 0;
        for (; removeCount < n; i++) {
            int maxIndex = i;
            for (int j = i+1; j < i+n-removeCount+1; j++) {
                if (originArr[maxIndex] < originArr[j])
                    maxIndex = j;
            }
            resultArr[resultIndex] = originArr[maxIndex];
            removeCount += maxIndex - i;
            i = maxIndex;
            resultIndex++;
        }
        if (resultIndex < size - n) {
            for (int k = i; k < size; k++) {
                resultArr[resultIndex++] = originArr[k];
            }
        }
        for (int temp : resultArr) {
            result = result * 10 + temp;
        }
        return result;
    }

    public static String findMaxNum(String origin, int n) {
        StringBuilder result = new StringBuilder();
        int removeCount = 0, resultIndex = 0, i = 0;
        for (; removeCount < n; i++) {
            int maxIndex = i;
            for (int j = i+1; j < i+n-removeCount+1; j++) {
                if (origin.charAt(maxIndex) < origin.charAt(j))
                    maxIndex = j;
            }
            result.append(origin.charAt(maxIndex));
            removeCount += maxIndex - i;
            i = maxIndex;
            resultIndex++;
        }
        result.append(origin.substring(i, origin.length()));
        return result.toString();
    }


    final static int[] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE };
    static int sizeOfInt(int x) {
        for (int i = 0;; i++)
            if (x <= sizeTable[i])
                return i + 1;
    }
}

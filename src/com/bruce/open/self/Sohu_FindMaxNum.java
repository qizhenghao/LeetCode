package com.bruce.open.self;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/1/4 0004.
 */
public class Sohu_FindMaxNum {

    public static void main(String[] args) {

        System.out.println(findMaxNum(7938265, 3));
    }

    public static int findMaxNum(int num, int n) {
        int result = 0;
        int size = sizeOfInt(num);
        for (int i = 0; i < size; i++) {


        }
        return result;
    }


    final static int[] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE };
    static int sizeOfInt(int x) {
        for (int i = 0;; i++)
            if (x <= sizeTable[i])
                return i + 1;
    }
}

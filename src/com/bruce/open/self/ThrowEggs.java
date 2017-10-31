package com.bruce.open.self;

/**
 * Created by qizhenghao on 17/5/11.
 */
public class ThrowEggs {

    public static void main(String[] args) {

        System.out.println(getMinTimes(5));
        System.out.println(getMinTimes(10));
        System.out.println(getMinTimes(19));
    }

    private static int getMinTimes(int floor) {
        if (floor <=0)
            return 0;
        if (floor == 1)
            return 1;
        int min = 100;
        for (int i = 1; i < floor; i++) {
            min = Math.min(min, 1 + Math.max(i-1, getMinTimes(floor - i)));
        }
        return min;
    }
}

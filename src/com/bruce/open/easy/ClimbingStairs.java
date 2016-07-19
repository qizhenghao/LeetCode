package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/19.
 * <p>
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {

    public static void main(String[] args) {

        System.out.println(climbStairs(5) + "");
        System.out.println(climbStairs(6) + "");
        System.out.println(climbStairs(7) + "");
        System.out.println(climbStairs(20) + "");
        System.out.println(climbStairs(44) + "");
    }

    private static int climbStairs(int n) {
        if (n <= 1)
            return n;
        int now = 0, last = 1, lastLast = 1;
        for (int i = 2; i <= n; i++) {
            now = last + lastLast;
            lastLast = last;
            last = now;
        }
        return now;
//        if (n < 0)
//            return 0;
//        if (n <= 3)
//            return n;
//        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}

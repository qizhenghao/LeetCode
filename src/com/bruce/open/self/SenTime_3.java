package com.bruce.open.self;

/**
 * Created by qizhenghao on 17/4/8.
 */
public class SenTime_3 {

    public static void main(String[] args) {

    }

    public static int find_the_master(int N) {
        if (N < 2)
            return N;
        if (N == 2) {
            boolean b0_1 = follow(0, 1);
            boolean b1_0 = follow(1, 0);
            if (b0_1 && !b1_0)
                return 1;
            else if (!b0_1&&b1_0)
                return 0;
            return -1;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j)
                    continue;
                if (!follow(j, i) || follow(i, j))
                    break;
                if (j == N -1)
                    return i;
            }
        }
        return -1;
    }

    public static boolean follow(int a, int b) {
        return true;
    }
}

package com.bruce.open.self;

import java.util.Scanner;

/**
 * Created by qizhenghao on 17/4/8.
 */
public class MicroSoft_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.nextLine();
        String[] numArr = numStr.split(" ");
        int N = Integer.parseInt(numArr[0]);
        int Q = Integer.parseInt(numArr[1]);
        int M = (int) Math.round(Math.log(N) / Math.log(2) + 0.5f);
        int min = N;
        while (M >= 0) {
            min = Math.min((int)Math.round(N/Math.pow(2, M) + 0.5f) + M * Q, min);
            M--;
        }
        System.out.println(min);
//        System.out.println(minNum(N, M, Q));
    }

    public static int minNum(int n, int m, int Q) {
        if (m == 0)
            return n;
        return Math.min((int)Math.round(n/Math.pow(2, m) + 0.5f) + m * Q, minNum(n, m-1, Q));
    }
}

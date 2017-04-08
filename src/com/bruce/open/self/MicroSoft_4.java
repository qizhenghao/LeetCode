package com.bruce.open.self;

import java.util.Scanner;

/**
 * Created by qizhenghao on 17/4/8.
 */
public class MicroSoft_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.nextLine();
        int N = Integer.parseInt(numStr);
        int[][] arr = new int[2][N];
        String[] strArr;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            strArr = scanner.nextLine().split(" ");
            arr[0][i] = Integer.parseInt(strArr[0]);
            arr[1][i] = Integer.parseInt(strArr[1]);
            sum = sum + arr[0][i] + arr[1][i];
        }
        System.out.println(sum);
        int ave = sum/N/2;

        for (int i = 0; i < N; i++) {
//            if (arr[0][i] > ave)
        }

//        System.out.println(min);
//        System.out.println(minNum(N, M, Q));
    }

    public static int minNum(int n, int m, int Q) {
        if (m == 0)
            return n;
        return Math.min((int)Math.round(n/Math.pow(2, m) + 0.5f) + m * Q, minNum(n, m-1, Q));
    }
}

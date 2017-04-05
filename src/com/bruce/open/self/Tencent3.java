package com.bruce.open.self;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by qizhenghao on 17/4/2.
 *
 *
 10
 a
 he
 she
 abadon
 we
 wechat
 yes
 osu
 his
 her
 5
 query he
 query his
 insert history
 query his
 insert her


 输出结果
 2
 1
 0
 2
 1
 */
public class Tencent3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        int N = Integer.parseInt(nextLine);


        Set<String> set = new HashSet<>(N);

        String line;
        for (int i = 0; i < N; i++) {
            line = scanner.nextLine();
            set.add(line);
        }
        nextLine = scanner.nextLine();
        int M = Integer.parseInt(nextLine);

        int[] output = new int[M];
        String[] arr;
        for (int i = 0; i < M; i++) {
            line = scanner.nextLine();
            arr = line.split(" ");
            if ("insert".equals(arr[0])) {
                output[i] = set.add(arr[1]) ? 0 : 1;
            } else if ("query".equals(arr[0])) {
                for (String item : set) {
                    if (item.length() >= arr[1].length() && item.substring(0, arr[1].length()).equals(arr[1]))
                        output[i]++;
                }
            }
        }

        for (int i = 0; i < M; i++) {
            System.out.println(output[i]);
        }
    }
}

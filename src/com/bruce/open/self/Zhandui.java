package com.bruce.open.self;


import java.util.Scanner;

/**
 * Created by qizhenghao on 17/4/7.
 * <p/>
 * X1X#2X#XX
 *
 * X1X#2X#XXX1X#2X#XXX3X#2X#XX
 */
public class Zhandui {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        int N = Integer.parseInt(nextLine);
        String input = scanner.nextLine();

        int result = 0;
        char c;
        int last = 0;
        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);
            if ('1' <= c && '9' >= c) {
                int x = (c - '0');
                int max = Math.max(last, i - x);
                for (int m = max; m < i; m++) {
                    if (input.charAt(m) == 'X')
                        result++;
                }
                max = i + x;
                boolean flag = true;
                int k = i + 1;
                for (; k <= max && flag; k++) {
                    c = input.charAt(k);
                    if (c == 'X')
                        result++;
                    if ('1' <= c && '9' >= c) {
                        flag = false;
                    }
                }
                i = flag ? k - 1 : max - 1;
                last = i + 1;
            }
        }

        System.out.println(result);
    }
}

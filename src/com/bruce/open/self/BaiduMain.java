package com.bruce.open.self;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaiduMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String keys = "qwertyuiopasdfghjkl;zxcvbnm,./";
        Map<Character, Integer> map = new HashMap(41);
        for (int i = 0; i < keys.length(); i++) {
            map.put(keys.charAt(i), i);
        }

        double sum = 0d, width;
        int inputLength = input.length();
        if (inputLength != 0) {
            int index1 = map.get(input.charAt(0)), index2;
            for (int i = 1; i < inputLength; i++) {
                index2 = map.get(input.charAt(i));
                width = Math.abs(index1 % 10 - index2 % 10) * 1.0d;
                //表示在同一行
                if ((index1 < 10 && index2 < 10) || ((10 <= index1 && index1 < 20) &&
                        (10 <= index2 && index2 < 20)) || ((20 <= index1 && index1 < 30)
                        && (20 <= index2 && index2 < 30))) {
                    sum += width;
                }//表示隔行
                else if ((index1 < 10 && index2 >= 20) || (index1 >= 20 && index2 < 10)) {
                    sum += Math.sqrt(width * width + 4.0d); //4=2*2
                } //表示邻行
                else {
                    sum += Math.sqrt(width * width + 1.0d);
                }
                index1 = index2;
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat(".00000");
        System.out.println(decimalFormat.format(sum));
    }
}

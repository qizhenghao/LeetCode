package com.bruce.open.self;

/**
 * Created by qizhenghao on 17/3/28.
 */
public class TestASCLL {

    public static void main(String[] args) {

        int o = 0xFFFFFF01;
        int j = ~o;
        System.out.println(o + ", " + j);

        System.out.println('a');

        int a = 'a';
        System.out.println(a);

        char b = (char) (a + 1);
        System.out.println(b + 1);

        char c = (char)126;
        System.out.println(c);

        System.out.println(compress("aaabb" +
                "ccccccccccccccccccccccccccccccccccccccccccccccc" +
                "ccccccccccccccccccccccccccccccccccccccccccccccc" +
                "ccccccccccccccccccccccccccccccccccccccccccccccc" +
                "ccccccccccccccccccccccccccccccccccccccccccccccc" +
                "ccccccccccccccccccccccccccccccccccccccccccccccc" +
                "ccccccccccccccccccccccccccccccccccccccccccccccc" +
                "ccccccccccccccccccccccccccccccccccccccccccccccc" +
                "ccccccccccccccccccccccccccccccccccccccccccccccc" +
                "ccccccccccccccccccccccccccccccccccccccccccccccc" +
                "ccccccccccccccccccccccccccccccccccccccccccccccc" +
                "ccccccccccccccccccccccccccccccccccccccccccccccc" +
                "ccccccccccccccccccccccccccccccccccccccccccccccc" +
                "ccccccccccccccccccccccccccccccccccccccccccccccc" +
                "ccccccccccccccccccccccccccccccccccccccccccccccc" +
                "ccccccccccccccccccccccccccccccccccccccccccccccc" +
                "ccccccccccccd"));


//        for (int i = 0; i < 10000; i++) {
//            System.out.print((char)i + "  ");
//            if (i % 50 ==0)
//                System.out.println();
//        }
    }

    public static String compress(String input) {
        if (input == null || input.length() < 2)
            return input;

        StringBuilder outputSB = new StringBuilder();
        char lastChar = input.charAt(0);
        outputSB.append(lastChar);
        char start = (char)'1';
        char cCount = start;
        int length = input.length();
        for (int i = 1; i < length; i++) {
            char c = input.charAt(i);
            if (lastChar == c)
                cCount++;
            else {
                lastChar = c;
                outputSB.append(cCount).append(lastChar);
                cCount = start;
            }
        }
        if (cCount == start)
            outputSB.append(cCount);

        return outputSB.toString();
    }
}

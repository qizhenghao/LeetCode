package com.bruce.open.offer;


import java.util.Arrays;

/**
 * Created by qizhenghao on 17/2/24.
 *
 * 题目:从扑克牌中随机抽 5 张牌,判断是不是顺子,即这 5 张牌是不是连续的。 2-10 为数字本身,
 * A 为 1,J 为 11,Q 为 12,K 为 13,而大小王可以看成任意的 数字
 */
public class Question_44 {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 5, 6, 0, 2, 0, 0, 9, 9};

        System.out.println(isContinuous(arr));
    }

    public static boolean isContinuous(int[] number) {
        if (number == null) {
            return false;
        }
        Arrays.sort(number);
        int zeroNum = 0;
        int gapNum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] != 0) {
                if (i > zeroNum) {
                    if (number[i] == number[i-1])
                        return false;
                    gapNum += number[i] - 1 - number[i-1];
                }
            } else {
                zeroNum++;
            }
        }
        return gapNum <= zeroNum;
    }
}

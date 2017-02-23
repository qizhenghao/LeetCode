package com.bruce.open.offer;

/**
 * Created by qizhenghao on 17/2/17.
 *
 * 题目描述:一个二维数组,每一行从左到右递增,每一列从上到下递增.输 入一个二维数组和一个整数,判断数组中是否含有整数。
 */
public class Question_3 {



    public static void main(String[] args) {

        int[][] testarray = new int[3][4];
        testarray[0][0]=1;
        testarray[0][1]=2;
        testarray[0][2]=8;
        testarray[0][3]=9;
        testarray[1][0]=2;
        testarray[1][1]=4;
        testarray[1][2]=9;
        testarray[1][3]=12;
        testarray[2][0]=4;
        testarray[2][1]=7;
        testarray[2][2]=10;
        testarray[2][3]=13;
//        testarray[3][0]=6;
//        testarray[3][1]=8;
//        testarray[3][2]=11;
//        testarray[3][3]=15;
        System.out.println(testarray.length);
        System.out.println(testarray[0].length);

        System.out.println(find_1(testarray, 10));
        System.out.println(find_2(testarray, 5));
        System.out.println(find_1(testarray, 10));
    }

    public static boolean find_1(int[][] arr, int num) {
        int row = arr.length;
        int column = arr[0].length;
        for (int[] anArr : arr) {
            for (int j = 0; j < column; j++) {
                if (anArr[j] == num)
                    return true;
            }
        }
        return false;
    }

    public static boolean find_2(int[][] arr, int num) {
        int row = 0;
        int column = arr[0].length-1;
        while (row<arr.length && column>0) {
            System.out.println(row + ", " + column);
            if (arr[row][column] == num)
                return true;
            else if (arr[row][column] > num) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }
}

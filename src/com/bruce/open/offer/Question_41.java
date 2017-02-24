package com.bruce.open.offer;

/**
 * 输一个递增排序的数组和一个数字 s,在数组中查找两个数使得它们的 和正好是 s。如果有多对数字的和等于 s,
 * 输出任意一对即可。例如:输入数组 {1,2,4,7,11,15}和数字为 15.输出 4 和 11.
 */
public class Question_41 {
    public static void main(String[] args) {
        Question_41 p = new Question_41();
        int[] data = {1, 2, 4, 7, 11, 15};
        int sum = 15;
        System.out.println(p.findNumberWithSum(data, sum));
    }

    public boolean findNumberWithSum(int[] data, int sum) {
        if (data == null || data.length < 2)
            return false;
        int start = 0, end = data.length - 1;
        int tempSum = 0;
        while (start < end) {
            tempSum = data[start] + data[end];
            if (tempSum == sum) {
                System.out.println(data[start] + ", " + data[end]);
                return true;
            } else if (tempSum < sum) {
                start++;
            } else {
                end--;
            }
        }
        return false;
    }
}
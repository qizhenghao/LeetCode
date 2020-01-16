package com.bruce.open.micode;

import java.util.Arrays;

/**
 * Created by qizhenghao.
 */

public class Q14 {

    public static void main(String[] args) {

        System.out.println(solution("4,5,6,7,0,1,2 6"));
    }

    private static String solution(String line) {
        // 在此处理单行数据
        String[] arrStr = line.split(" ");

        String[] strings = arrStr[0].split(",");
        int target = Integer.parseInt(arrStr[1]);
        int[] nums = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }

        int low = 0 , high = nums.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high)/2;
            if (target == nums[mid])
                return String.valueOf(mid);
            if (nums[mid] < nums[high]) {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (target < nums[mid] && target >= nums[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        // 返回处理后的结果
        return "-1";
    }
}

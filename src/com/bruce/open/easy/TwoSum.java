package com.bruce.open.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by qizhenghao on 16/7/14.
 *
 *
 Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution.

 Example:
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].

 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};

        System.out.println(Arrays.toString(twoSum(nums, 9)) + "");
    }

    static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        //最低级写法
//        for (int i=0;i<nums.length;i++) {
//            for (int j=0;j<nums.length;j++) {
//                if (i != j && nums[i] + nums[j]==target) {
//                    result[0] = i>j?j:i;
//                    result[1] = i>j?i:j;
//                }
//            }
//        }

        //利用map
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++) {
            map.put(nums[i], i);
        }

        for (int i=0;i<nums.length;i++) {
            int temp = target - nums[i];
            Integer n = map.get(temp);
            if (n != null && n != i) {

                result[0] = i>n?n:i;
                result[1] = i>n?i:n;
            }
        }

        return result;
    }
}

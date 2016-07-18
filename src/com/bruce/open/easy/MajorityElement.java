package com.bruce.open.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qizhenghao on 16/7/18.
 * <p>
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * <p>
 * Credits:
 * Special thanks to @ts for adding this problem and creating all test cases.
 * Subscribe to see which companies asked this question
 */
public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1, 2, 3, 1, 1, 4, 5, 1, 1, 1, 6}) + "");
        System.out.println(majorityElement(new int[]{1, 0, 1}) + "");
    }

    private static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.get(num) == null) {
                map.put(num, 0);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        int maxValue = 0;
        int maxKey = 0;
        for (Object o : map.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            if ((int) entry.getValue() >= maxValue) {
                maxValue = (int) entry.getValue();
                maxKey = (int) entry.getKey();
            }
        }
        return maxKey;
    }
}

package com.bruce.open.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by qizhenghao on 16/7/18.
 */
public class ContainsDuplicate {

    public static void main(String[] args) {

        System.out.println(containsDuplicate(new int[]{1}) + "");
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 1}) + "");
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 5}) + "");
    }

    private static boolean containsDuplicate(int[] nums) {

        if (nums == null || nums.length <= 1)
            return false;
        Set<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}

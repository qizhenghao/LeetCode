package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/20.
 * <p>
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed, the only constraint stopping
 * you from robbing each of them is that adjacent houses have security system
 * connected and it will automatically contact the police if two adjacent houses
 * were broken into on the same night.
 * <p>
 * Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class HouseRob {

    public static void main(String[] args) {

        System.out.println(rob(new int[]{1, 3, 1, 4, 2, 3, 8, 7, 6}) + "");
        System.out.println(rob(new int[]{1, 3, 1, 4}) + "");
        System.out.println(rob(new int[]{1, 3, 1, 4, 8}) + "");
    }

    /**
     * max[n] = max(max[max[n-2] + num[n], max[n-1])
     *
     * @param nums
     * @return
     */
    private static int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        int preMax = nums[0], temp;
        int max = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            temp = preMax;
            preMax = max;
            max = Math.max(temp + nums[i], preMax);
        }
        return max;
    }
}

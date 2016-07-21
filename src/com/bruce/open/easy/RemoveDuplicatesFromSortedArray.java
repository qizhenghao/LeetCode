package com.bruce.open.easy;

import java.util.Arrays;

/**
 * Created by qizhenghao on 16/7/21.
 * <p>
 * Given a sorted array, remove the duplicates in place such that each element appear
 * only once and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p>
 * For example,
 * Given input array nums = [1,1,2],
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 2, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6};
//        int[] nums = new int[]{1, 1};
//        int[] nums = new int[]{1};
//        int[] nums = new int[]{};
        System.out.println(removeDuplicates(nums) + "");
        System.out.println(Arrays.toString(nums) + "");
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int length = 1, index = 1;
        while (index < nums.length) {
            if (nums[index] != nums[length -1])
                nums[length++] = nums[index];
            index++;
        }
        return length;
    }

    //效率太低
    private static int removeDuplicates1(int[] nums) {
        if (nums.length<2)
            return nums.length;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            length = removeElement(nums, nums[i], i, length);
        }
        return length;
    }

    private static int removeElement(int[] nums, int val, int index, int length) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0] == val ? 0 : 1;
        int count = 0;
        int startIndex = -1, endIndex = -1;
        for (int i = index; i < length && endIndex == -1; i++) {
            if (val == nums[i] && startIndex == -1) {
                startIndex = i + 1;
            } else if (val != nums[i] && startIndex != -1) {
                endIndex = i;
                count = endIndex - startIndex;
            }
        }
        if (startIndex == -1)
            return length;
        if (endIndex == -1)
            return startIndex;
        int lengthTemp = nums.length - startIndex - 1;
        for (int i = 0; i < lengthTemp && endIndex < length; i++) {
            nums[startIndex++] = nums[endIndex++];
        }
        return length - count;
    }
}

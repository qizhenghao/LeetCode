package com.bruce.open.easy;

import java.util.*;

/**
 * Created by Administrator on 2016/7/18 0017.
 * <p>
 * Given two arrays, write a function to compute their intersection.
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 * <p>
 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * <p>
 * Follow up:
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you
 * cannot load all elements into the memory at once?
 */
public class IntersectionOfTwoArrays2 {

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis() + "");
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 4, 3, 55, 53}, new int[]{2, 1, 3, 2, 53, 99, 4})));
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2, 3})));
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2, 3, 1, 3, 1, 2, 5})));
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 1}, new int[]{2, 2, 3})));
        System.out.println(Arrays.toString(intersect(new int[]{3, 1, 2}, new int[]{1, 3})));
        System.out.println(System.currentTimeMillis() + "");

        System.out.println(System.currentTimeMillis() + "");
        System.out.println(Arrays.toString(intersect1(new int[]{1, 2, 2, 4, 3, 55, 53}, new int[]{2, 1, 3, 2, 53, 99, 4})));
        System.out.println(Arrays.toString(intersect1(new int[]{1, 2, 2, 1}, new int[]{2, 2, 3})));
        System.out.println(Arrays.toString(intersect1(new int[]{1, 2, 2, 1}, new int[]{2, 2, 3, 1, 3, 1, 2, 5})));
        System.out.println(Arrays.toString(intersect1(new int[]{1, 2, 1}, new int[]{2, 2, 3})));
        System.out.println(System.currentTimeMillis() + "");
    }


    //第一种,题目理解错误,这个写法是错的
    static int[] intersect(int[] nums1, int[] nums2) {

        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result = new int[0];
        int startIndex, endIndex;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    startIndex = i;
                    for (int k = 0; k + i < nums1.length && k + j < nums2.length; k++) {
                        if (nums1[k + i] != nums2[k + j] || k + i + 1 == nums1.length || k + j + 1 == nums2.length) {
                            endIndex = (k + i + 1 == nums1.length || k + j + 1 == nums2.length) && nums1[k + i] == nums2[k + j] ? k + i + 1 : k + i;
                            if (startIndex <= endIndex) {
                                result = new int[endIndex - startIndex];
                                System.arraycopy(nums1, startIndex, result, 0, result.length);
                                return result;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    //    第二种
    public static int[] intersect1(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums1) {
            map.put(n, map.containsKey(n) ? map.get(n) + 1 : 1);
        }
        List<Integer> list = new ArrayList<>(Math.min(nums1.length, nums2.length));
        for (int n : nums2) {
            if (map.containsKey(n)) {
                list.add(n);
                map.put(n, map.get(n) - 1);
                if (map.get(n) == 0)
                    map.remove(n);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

}

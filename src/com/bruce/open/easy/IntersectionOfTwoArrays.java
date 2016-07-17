package com.bruce.open.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/17 0017.
 */
public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 4, 3, 55, 53}, new int[]{2, 1, 3, 53, 99})));
    }


    static int[] intersection(int[] nums1, int[] nums2) {

        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int[] temp = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i], i);
        }
        for (int i = 0; i < nums2.length; i++) {
            map2.put(nums2[i], i);
        }
        int n = 0;
        Iterator iter = map1.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();
            if (map2.get(key) != null) {
                temp[n] = (int) key;
                n++;
            }
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}

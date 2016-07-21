package com.bruce.open.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by qizhenghao on 16/7/21.
 * <p>
 * Given numRows, generate the first numRows of Pascal's triangle.
 * <p>
 * For example, given numRows = 5,
 * Return
 * <p>
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class PascalTriangle {

    public static void main(String[] args) {

        List<List<Integer>> list = generate(6);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(Arrays.toString(list.get(i).toArray()) + "");
        }
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>(numRows);
        if (numRows <= 0)
            return list;
        if (numRows > 0) {
            List<Integer> itemList = new ArrayList<>(1);
            itemList.add(1);
            list.add(itemList);
            if (numRows == 1)
                return list;
            List<Integer> itemList2 = new ArrayList<>(2);
            itemList2.add(1);
            itemList2.add(1);
            list.add(itemList2);
        }

        for (int i = 2; i < numRows; i++) {
            List<Integer> itemList = new ArrayList<>();
            itemList.add(1);
            for (int j = 1; j < i; j++) {
                itemList.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
            }
            itemList.add(1);
            list.add(itemList);
        }

        return list;
    }

}

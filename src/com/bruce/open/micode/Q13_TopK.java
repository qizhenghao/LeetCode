package com.bruce.open.micode;

import java.util.Arrays;

/**
 * Created by qizhenghao.
 */

public class Q13_TopK {

    public static void main(String[] args) {

        System.out.println(solution("1,1,1,2,2,3 2"));
        System.out.println(solution("1,1,1,2,2,3 1"));
        System.out.println(solution("1,1,1,2,2,3,3,3,3,4,4,4,4,4,4 3"));
        System.out.println(solution("1,2,2,3,3 3"));
        System.out.println(solution("1,1,3,3,2,2 2"));
    }

    private static String solution(String line) {
        // 在此处理单行数据
        StringBuilder result;
        String[] arrStr = line.split(" ");

        String[] strings = arrStr[0].split(",");
        int K = Integer.parseInt(arrStr[1]);
        int[] nums = new int[strings.length];
        Node[] res = new Node[strings.length];
        for (int i = 0; i < strings.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }

        Arrays.sort(nums);
        int n = nums[0], index = 0;
        Node node = new Node();
        node.key = n;
        node.value = 0;
        res[index] = node;
        for (int num : nums) {
            if (n == num) {
                res[index].value++;
            } else {
                n = num;
                node = new Node();
                node.key = n;
                node.value = 1;
                index++;
                res[index] = node;
            }
        }

        Node[] resT = new Node[index + 1];
        System.arraycopy(res, 0, resT, 0, index + 1);
        Arrays.sort(resT);
        result = new StringBuilder(String.valueOf(resT[0].key));
        for (int i = 1; i < K; i++) {
            result.append(",").append(resT[i].key);
        }
        // 返回处理后的结果
        return result.toString();
    }

    static class Node implements Comparable<Node> {
        int key;
        int value;

        @Override
        public int compareTo(Node o) {
            return o.value - this.value;
        }
    }
}

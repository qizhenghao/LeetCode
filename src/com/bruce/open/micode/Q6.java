package com.bruce.open.micode;

/**
 * Created by qizhenghao on 17/10/30.
 * 描述
 * <p>
 * 给出三个队列 s1，s2，s3 ，判断 s3 是否是由 s1 和 s2 交叉得来。
 * 如：s1 为 aabcc ， s2 为 dbbca。
 * 当 s3 为 aadbbcbcac 时，返回 true（即将 s1 拆成三部分： aa，bc，c 分别插入 s2 对应位置）
 * 否则返回 false。
 * 输入
 * <p>
 * aabcc,dbbca,aadbbcbcac
 * 输出
 * <p>
 * true
 */

public class Q6 {

    public static void main(String[] args) {

        System.out.println(solution("aabcc,dbbca,aadbbcbcac"));
        System.out.println(solution("aabcc,dbbca,aadbbbaccc"));
        System.out.println(solution("a,b,ab"));
        System.out.println(solution("a,b,ba"));
        System.out.println(solution("a,b,ac"));
        System.out.println(solution("abc,bca,bcaabc"));
        System.out.println(solution("abc,bca,aabbcc"));
    }

    private static String solution(String line) {
        // 在此处理单行数据
        String[] arrStr = line.split(",");
        String s1 = arrStr[0], s2 = arrStr[1], s3 = arrStr[2];
        int index1 = 0, index2 = 0, length1 = s1.length(), length2 = s2.length(), length3 = s3.length();
        char a1 = s1.charAt(index1), a2 = s2.charAt(index2), a3;
        for (int i = 0; i < length3; i++) {
            if (index1 < length1)
                a1 = s1.charAt(index1);
            if (index2 < length2)
                a2 = s2.charAt(index2);
            a3 = s3.charAt(i);
            if (a3 == a1 && index1 < length1) {
                index1++;
                while ((index1 < length1 && i < length3 - 1) && s1.charAt(index1) == s3.charAt(i + 1)) {
                    index1++;
                    i++;
                }
            } else if (a3 == a2 && index2 < length2) {
                index2++;
                while ((index2 < length2 && i < length3 - 1) && s2.charAt(index2) == s3.charAt(i + 1)) {
                    index2++;
                    i++;
                }
            } else {
                return String.valueOf(false);
            }
        }

        // 返回处理后的结果
        return String.valueOf(true);
    }
}

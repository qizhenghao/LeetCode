package com.bruce.open.micode;

/**
 * Created by qizhenghao.
 */

public class Q12 {

    public static void main(String[] args) {

        System.out.println(solution("1,2,3 4"));
    }

    static int sum;

    private static String solution(String line) {
        String a1[] = line.split(" ");
        String a2[] = a1[0].split(",");
        int goal2 = Integer.parseInt(a2[a2.length - 1]);
        int goal1 = Integer.parseInt(a2[0]);
        int goal = Integer.parseInt(a1[1]);
        find(goal, goal1, goal2);
        return String.valueOf(sum);
    }

    public static void find(int target, int goal1, int goal2) {
        if (goal2 < goal1 || target < 0)
            return;
        if (target == 0) {
            sum++;
            return;
        }

        find(target - goal2, goal1, goal2);
        find(target, goal1, goal2 - 1);
        find(target - goal2, goal1, goal2 - 1);
    }
}

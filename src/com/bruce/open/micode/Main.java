package com.bruce.open.micode;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by qizhenghao on 18/9/13.
 **/
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] inputs = scan.nextLine().split(" ");

        int teamNum = Integer.parseInt(inputs[0]), lineNum = Integer.parseInt(inputs[1]);
        StringBuilder result = new StringBuilder(teamNum);
        HashMap<Integer, Integer> inputMap = new HashMap<>(lineNum * 4 / 3 + 1);
        int sumRight = 0, sumLeft = 0;
        for (int i = 0; i < lineNum; i++) {
            String[] lines = scan.nextLine().split(" ");
            int teamRightIndex = Integer.parseInt(lines[1]), teamLeftIndex = Integer.parseInt(lines[0]);
            sumRight += teamRightIndex;
            sumLeft += teamLeftIndex;
            inputMap.put(teamLeftIndex, teamRightIndex);
        }

        int first = (teamNum + 1)*teamNum/2 - sumRight;
        int end = (teamNum + 1)*teamNum/2 - sumLeft;
        int index = inputMap.get(first);
        inputMap.put(end, -1);
        result.append(first);
        while (index != -1) {
            result.append(" ").append(index);
            index = inputMap.get(index);
        }
        System.out.println(result.toString());
        System.out.println(result.toString().length());
    }
}

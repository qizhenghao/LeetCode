package com.bruce.open.self;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by qizhenghao on 17/3/30.
 */
public class TouTiao1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.nextLine();
        String[] numArr = numStr.split(" ");
        int N = Integer.parseInt(numArr[0]);
        int M = Integer.parseInt(numArr[1]);

        HashMap<String, Set<String>> nMap = new HashMap<>(N);

        String line;
        for (int i = 0; i < N; i++) {
            line = scanner.nextLine();
            String[] array = line.split(" ");
            int length = array.length;
            Set<String> set = new HashSet<>(length);
            for (int j = 0; j < length; j++) {
                set.add(array[j]);
            }
            nMap.put(line, set);
        }

        int s, lastS;
        String[] result = new String[M];
        for (int i = 0; i < M; i++) {
            lastS = -1;
            line = scanner.nextLine();
            String[] array = line.split(" ");
            int length = array.length;
            Set<String> mSet = new HashSet<>(length);
            for (int j = 0; j < length; j++) {
                mSet.add(array[j]);
            }

            for (Object key : nMap.keySet()) {
                Set<String> nSet = nMap.get(key);
                Set<String> tempSet = new HashSet<>();
                tempSet.addAll(nSet);
                tempSet.addAll(mSet);
                s = mSet.size() - (tempSet.size() - nSet.size());
                if (s > lastS) {
                    lastS = s;
                    result[i] = (String) key;
                }
            }
        }

        for (int i = 0; i < M; i++) {
            System.out.println(result[i]);
        }

    }

}

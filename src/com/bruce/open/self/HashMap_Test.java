package com.bruce.open.self;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by qizhenghao on 17/3/31.
 */
public class HashMap_Test {

    public static void main(String[] args) {

        Map synchronizedMap = Collections.synchronizedMap(new HashMap()); //同步map

        ConcurrentMap concurrentMap = new ConcurrentHashMap();//同步map

        HashMap hashMap = new HashMap();


        testMutiThread();
    }

    private static HashMap<Integer, String> map = new HashMap<>(2, 0.75f);

    public static void testMutiThread() {
        map.put(5, "C");

        new Thread("Thread1") {
            public void run() {
                map.put(7, "B");
                System.out.println(map);
            }
        }.start();

        new Thread("Thread2") {
            public void run() {
                map.put(3, "A");
                System.out.println(map);
            }
        }.start();
    }
}

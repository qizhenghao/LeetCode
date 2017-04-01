package com.bruce.open.self;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by qizhenghao on 17/3/31.
 */
public class TestTreeMap {

    public static void main(String[] args) {


        TreeMap<String, String> treeMap = new TreeMap<String, String>(
//                new Comparator<String>() {
//                    @Override
//                    public int compare(String o1, String o2) {
//                        return  1;
//                    }
//                }
        );

        treeMap.put("a", "a");
        treeMap.put("a", "aa");
        treeMap.put("bb", "bb");
        treeMap.put("ccc", "ccc");
        treeMap.put("fffff", "fffff");
        treeMap.put("dddd", "dddd");

        Iterator<Map.Entry<String, String>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }


        System.out.println();

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("a", "a");
        hashMap.put("a", "aa");
        hashMap.put("bb", "bb");
        hashMap.put("ccc", "ccc");
        hashMap.put("fffff", "fffff");
        hashMap.put("dddd", "dddd");

        Iterator<Map.Entry<String, String>> hashMapIte = hashMap.entrySet().iterator();
        while (hashMapIte.hasNext()) {
            Map.Entry entry = hashMapIte.next();
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}

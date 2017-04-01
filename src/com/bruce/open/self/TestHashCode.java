package com.bruce.open.self;

/**
 * Created by qizhenghao on 17/3/31.
 */
public class TestHashCode {

    public static void main(String[] args) {

        int h;
        String a = "aaaaa";
        System.out.println(a.hashCode() + ", " + ((h = a.hashCode()) ^ (h >>> 16)));

        String b = "bbbbbb";
        System.out.println(b.hashCode() + ", " + ((h = b.hashCode()) ^ (h >>> 16)));

        String c = "cccccccccccccccc";
        System.out.println(c.hashCode() + ", " + ((h = c.hashCode()) ^ (h >>> 16)));

        Integer d = 5;
        System.out.println(d.hashCode() + ", " + ((h = d.hashCode()) ^ (h >>> 16)));

        Character e = 'a';
        System.out.println(e.hashCode() + ", " + ((h = e.hashCode()) ^ (h >>> 16)));

        Object f = new Object();
        System.out.println(f.hashCode() + ", " + ((h = f.hashCode()) ^ (h >>> 16)));

        TestHashCode g = new TestHashCode();
        System.out.println(g.hashCode() + ", " + ((h = g.hashCode()) ^ (h >>> 16)));
    }
}

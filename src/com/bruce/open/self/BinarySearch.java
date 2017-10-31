package com.bruce.open.self;

/**
 * Created by qizhenghao on 17/5/10.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 7, 8, 8,9 ,9};
        System.out.println(binarySearch(arr, 5));
        System.out.println(biSearchFirstIndex(arr, 7));
        System.out.println(biSearchLastIndex(arr, 7));
//        System.out.println(binarySearch(arr, 9));
//        System.out.println(binarySearch(arr, 11));
    }

    private static int binarySearch(int[] arr, int a) {
        int low = 0, high = arr.length -1;
        int mid;
        while (low <= high) {
            mid = (low + high) /2;
            if (arr[mid] == a) {
                return mid;
            } else if (arr[mid] > a) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private static int biSearchFirstIndex(int[] arr, int a) {
        int low = 0, high = arr.length - 1;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (arr[mid] < a) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        if (arr[low] != a) {
            return -1;
        } else {
            return low;
        }
    }

    private static int biSearchLastIndex(int[] arr, int a) {
        int low = 0, high = arr.length -1;
        int mid;
        while (low < high) {
            mid = (low + high + 1) / 2;
            if (arr[mid] <= a) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }

        if (arr[low] != a) {
            return -1;
        } else {
            return high;
        }
    }

}

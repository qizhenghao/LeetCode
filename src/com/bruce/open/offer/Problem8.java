package com.bruce.open.offer;

public class Problem8 {
    public static void main(String[] args) {
        Problem8 p8 = new Problem8();
//int[] array={1,1,1,2,0};
 int[] array={3,4,5,1,2};
//        int[] array = {1, 0, 1, 1, 1};
        System.out.println(p8.findMinNum(array));
    }

    public Integer findMinNum(int[] array) {
        if (array == null) {
            return null;
        }
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        int mid = 0;
        while (array[leftIndex] >= array[rightIndex]) {
            if (rightIndex - leftIndex <= 1) {
                mid = rightIndex;
                break;
            }
            mid = (leftIndex + rightIndex) / 2;
            if (array[leftIndex] == array[rightIndex] && array[leftIndex] == array[mid]) {
                if (array[leftIndex + 1] != array[rightIndex - 1]) {
                    mid = array[leftIndex + 1] < array[rightIndex - 1] ? (leftIndex + 1) : (rightIndex - 1);
                    break;
                } else {
                    leftIndex++;
                    rightIndex--;
                }
            } else {
                if (array[mid] >= array[leftIndex])
                    leftIndex = mid;
                else {
                    if (array[mid] <= array[rightIndex]) rightIndex = mid;
                }
            }
        }
        return array[mid];
    }
}
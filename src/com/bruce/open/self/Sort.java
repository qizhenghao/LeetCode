package com.bruce.open.self;

import java.util.Arrays;

public class Sort {
    static boolean less(int a, int b){
		return a<b;
	}
	
	static void exch(int array[],int i,int j){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	static void comExch(int array[],int i,int j){
		if(less(array[j],array[i]))
			exch(array,i,j);
	}
	
	//扫描
	static int partition(int a[],int l,int r){
		int i=l-1,j=r;
		int v=a[r];
		for(;;){
			while(less(a[++i],v));
			while(less(v,a[--j])){
				if(j==l)break;
			}
			if(i>=j)break;
			exch(a,i,j);
		}
		exch(a,i,r);
		return i;
	}
	//快速排序
	static void quicksort(int a[],int l,int r){
		if(r<=l)return;
		int i=partition(a, l, r);
		quicksort(a,l,i-1);
		quicksort(a,i+1,r);
	}
	public static void main(String args[]){
		int array[]={1,2,3,5,4,9,8,10};
		quicksort(array,0,7);
		for(Integer n:array){
			System.out.print(n + " ");
		}

        int[] arr = {3, 3, 2, 1, 1, 5, 5, 4, 3, 3, 4};
        quicksort(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }
}

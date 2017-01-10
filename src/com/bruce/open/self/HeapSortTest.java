package com.bruce.open.self;

public class HeapSortTest {

	public static void main(String[] args) {
        int[] data5 = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		print(data5);
        System.out.println("排序中——");
//        heapSort1(data5);
//        insertSort(data5);
        shellSort(data5);
		System.out.println("排序后——");
		print(data5);
	}

	public static void swap(int[] data, int i, int j) {
		if (i == j) {
			return;
		}
		data[i] = data[i] + data[j];
		data[j] = data[i] - data[j];
		data[i] = data[i] - data[j];
	}

	public static void heapSort(int[] data) {
		for (int i = 0; i < data.length; i++) {
			createMaxdHeap(data, data.length - 1 - i);
			swap(data, 0, data.length - 1 - i);
			print(data);
		}
	}

	public static void createMaxdHeap(int[] data, int lastIndex) {
		for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
			// 保存当前正在判断的节点
			int k = i;
			// 若当前节点的子节点存在
			while (2 * k + 1 <= lastIndex) {
				// biggerIndex总是记录较大节点的值,先赋值为当前判断节点的左子节点
				int biggerIndex = 2 * k + 1;
				if (biggerIndex < lastIndex) {
					// 若右子节点存在，否则此时biggerIndex应该等于 lastIndex
					if (data[biggerIndex] < data[biggerIndex + 1]) {
						// 若右子节点值比左子节点值大，则biggerIndex记录的是右子节点的值
						biggerIndex++;
					}
				}
				if (data[k] < data[biggerIndex]) {
					// 若当前节点值比子节点最大值小，则交换2者得值，交换后将biggerIndex值赋值给k
					swap(data, k, biggerIndex);
                    k = biggerIndex;
				} else {
					break;
				}
			}
		}
	}

	public static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.println();
	}




    public static void heapSort1(int[] data) {
        for (int i = data.length; i > 0 ; i--) {
            makeMaxHeap(data, i);
            swap(data, 0, i-1);
        }
    }

    private static void makeMaxHeap(int[] data, int lastIndex) {
        int lastParentIndex = lastIndex / 2;
        for (int index = lastParentIndex-1; index >= 0; index--) {
            int k = index;
            int leftChildIndex = k * 2 + 1;
            while (leftChildIndex <= lastIndex - 1) {
                int biggerIndex = leftChildIndex;
                if (++leftChildIndex <= lastIndex - 1 &&
                        data[biggerIndex] < data[leftChildIndex]) {
                    biggerIndex = leftChildIndex;
                }
                if (data[k] < data[biggerIndex]) {
                    swap(data, k, biggerIndex);
                    k = biggerIndex;
                    leftChildIndex = k * 2 + 1;
                } else {
                    break;
                }
            }
        }
    }

    //直接插入排序
    public static void insertSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int index = i, temp = data[index];
            while (index>0) {
                if (temp < data[index - 1]) {
                    data[index--] = data[index];
                    data[index] = temp;
                } else {
                    break;
                }
            }
        }
    }

    //shell sort
    public static void shellSort(int[] data, int n) {
        int dk = n/2;
        while (dk >= 1) {
            insertSort(data, dk, n);
            dk = dk / 2;
        }
    }

    public static void insertSort(int[] data, int dk, int n) {
        for (int i = 1; i < data.length; i++) {
            int index = i, temp = data[index];
            while (index>0) {
                if (temp < data[index - 1]) {
                    data[index--] = data[index];
                    data[index] = temp;
                } else {
                    break;
                }
            }
        }
    }


}
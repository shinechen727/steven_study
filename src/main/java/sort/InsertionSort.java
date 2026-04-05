package sort;

import java.util.Arrays;

/**
 * 插入排序算法实现
 * 时间复杂度: O(n²)
 * 空间复杂度: O(1)
 * 稳定排序
 */
public class InsertionSort {

    /**
     * 插入排序主方法
     * @param arr 待排序的整数数组
     */
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        // 从第二个元素开始,逐个插入到已排序部分
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // 将大于key的元素向后移动
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            // 插入key到正确位置
            arr[j + 1] = key;
        }
    }

    /**
     * 优化版插入排序 - 使用二分查找确定插入位置
     * @param arr 待排序的整数数组
     */
    public static void insertionSortBinary(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            
            // 使用二分查找找到插入位置
            int left = 0;
            int right = i - 1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] > key) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            
            // 将元素向后移动
            for (int j = i - 1; j >= left; j--) {
                arr[j + 1] = arr[j];
            }
            
            // 插入key到正确位置
            arr[left] = key;
        }
    }

    /**
     * 测试方法
     */
    public static void main(String[] args) {
        // 测试用例1: 普通数组
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("原始数组1: " + Arrays.toString(arr1));
        insertionSort(arr1);
        System.out.println("排序后数组1: " + Arrays.toString(arr1));
        
        System.out.println();
        
        // 测试用例2: 基本有序的数组 (插入排序在这种情况下效率很高)
        int[] arr2 = {1, 2, 3, 5, 4, 6, 7};
        System.out.println("原始数组2: " + Arrays.toString(arr2));
        insertionSort(arr2);
        System.out.println("排序后数组2: " + Arrays.toString(arr2));
        
        System.out.println();
        
        // 测试用例3: 二分查找优化版本
        int[] arr3 = {45, 23, 67, 12, 89, 34, 56};
        System.out.println("原始数组3: " + Arrays.toString(arr3));
        insertionSortBinary(arr3);
        System.out.println("排序后数组3: " + Arrays.toString(arr3));
        
        System.out.println();
        
        // 测试用例4: 包含重复元素
        int[] arr4 = {5, 3, 8, 3, 1, 5, 9, 2};
        System.out.println("原始数组4: " + Arrays.toString(arr4));
        insertionSort(arr4);
        System.out.println("排序后数组4: " + Arrays.toString(arr4));
    }
}

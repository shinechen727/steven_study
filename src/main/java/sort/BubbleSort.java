package sort;

import java.util.Arrays;

/**
 * 冒泡排序算法实现
 * 时间复杂度: O(n²)
 * 空间复杂度: O(1)
 * 稳定排序
 */
public class BubbleSort {

    /**
     * 冒泡排序主方法
     * @param arr 待排序的整数数组
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        // 外层循环控制排序轮数
        for (int i = 0; i < n - 1; i++) {
            // 标记本轮是否发生交换
            boolean swapped = false;
            
            // 内层循环进行相邻元素比较
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换相邻元素
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            
            // 如果本轮没有发生交换,说明数组已经有序,提前结束
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * 优化版冒泡排序 - 记录最后交换位置
     * @param arr 待排序的整数数组
     */
    public static void bubbleSortOptimized(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        int lastSwapIndex = n - 1;
        
        while (lastSwapIndex > 0) {
            int currentLastSwapIndex = 0;
            
            for (int j = 0; j < lastSwapIndex; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    currentLastSwapIndex = j;
                }
            }
            
            lastSwapIndex = currentLastSwapIndex;
        }
    }

    /**
     * 交换数组中的两个元素
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 测试方法
     */
    public static void main(String[] args) {
        // 测试用例1: 普通数组
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("原始数组1: " + Arrays.toString(arr1));
        bubbleSort(arr1);
        System.out.println("排序后数组1: " + Arrays.toString(arr1));
        
        System.out.println();
        
        // 测试用例2: 已排序数组
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("原始数组2: " + Arrays.toString(arr2));
        bubbleSort(arr2);
        System.out.println("排序后数组2: " + Arrays.toString(arr2));
        
        System.out.println();
        
        // 测试用例3: 优化版本测试
        int[] arr3 = {5, 1, 4, 2, 8, 3};
        System.out.println("原始数组3: " + Arrays.toString(arr3));
        bubbleSortOptimized(arr3);
        System.out.println("排序后数组3: " + Arrays.toString(arr3));
    }
}

package com.wustzdy.spring.event.bean.test;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 2, 5};
        int m = 3, n = 2;
        merge(array, m, n);

        for (int element : array) {
            System.out.print(" " + element);
        }

    }

    public static void merge(int[] array, int m, int n) {
        int i, j;
        for (i = m; i < m + n; i++) {
            int temp = array[i];
            for (j = i - 1; j > 0 && temp < array[j]; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
    }
}

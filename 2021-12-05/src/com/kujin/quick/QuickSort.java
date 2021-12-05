package com.kujin.quick;

import com.kujin.Sort;

public class QuickSort extends Sort {


    public int partition(int[] list, int left, int right) {

        int low = left;
        int high = right + 1;
        int pivot = list[left];
        int tmp = 0;

        do {
            do {
                low++;
            }while(list[low] < pivot);
            do {
                high--;
            }while(list[high] > pivot);
            if(low < high) {
                tmp = list[low];
                list[low] = list[high];
                list[high] = tmp;
            }
        }while(low < high);
        tmp = list[high];
        list[high] = list[left];
        list[left] = tmp;
        return high;
    }

    @Override
    public void sort(int[] list, int start, int end) {
        if(start < end) {
            int q = partition(list, start, end);
            sort(list, 0, q-1);
            sort(list, q + 1, end);
        }
    }

    @Override
    public void sort(int[] list, int size) {
        sort(list, 0 , size-1);
    }

    @Override
    public void printAll(int[] list, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(" " + list[i]);
    }
}

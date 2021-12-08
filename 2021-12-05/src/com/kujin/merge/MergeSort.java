package com.kujin.merge;

import com.kujin.Sort;

public class MergeSort extends Sort {


    public int[] merge (int[] list, int left, int mid, int right) {
        int[] sorted = new int[100];
        int i, j, k, l;
        i = left;
        j = mid + 1;
        k = left;
        while (i <= mid && j <= right) {
            if (list[i] <= list[j])
                sorted[k++] = list[i++];
            else
                sorted[k++] = list[j++];
        }
        if(i > mid) {
            for(l = j; l <= right; l++)
                sorted[k++] = list[l];
        }
        else {
            for (l = left; l <= right; l++)
                list[l] = sorted[l];
        }
        return list;
    }


    @Override
    public void sort(int[] list, int size) {
        int mid;
        int left = 0;
        int right = size -1;
        if (left < right) {
            mid = (left + right) / 2;
            sort(list, left, mid );
            sort(list, mid + 1, right);
            merge(list, left, mid, right);
        }
    }

    @Override
    public void printAll(int[] list, int size) {
        for(int i = 0; i < size; i++)
            System.out.print(" " + list[i]);
        System.out.println();
    }
}

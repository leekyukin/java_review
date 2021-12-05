package com.kujin.selection;

import com.kujin.Sort;

public class SelectionSort extends Sort {

    int[] list;
    int size;

    SelectionSort() {}

    SelectionSort(int[] list, int size) {
        this.list = list;
        this.size = size;
    }


    public void sort(int[] list, int size) {
        new SelectionSort(list, size);
        int k, tmp;

        for(int i = 0; i < size-1; i++) {
            k = i;
            for(int j = i + 1; j < size; j++) {
                if(list[k] > list[j])
                    k = j;
            }
            tmp = list[k];
            list[k] = list[i];
            list[i] = tmp;
        }
    }

    public void printAll(int[] list, int size) {
        for(int i =0; i < size; i++)
            System.out.print(" " + list[i]);
    }


}

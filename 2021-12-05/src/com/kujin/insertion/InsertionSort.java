package com.kujin.insertion;

import com.kujin.Sort;

public class InsertionSort extends Sort {

    @Override
    public void sort(int[] list, int size) {
        int i,j,key;

        for(i = 1; i < size; i++){
            key = list[i];
            for(j = i-1; j >= 0 && list[j] > key; j--)
                list[j + 1] = list[j];
            list[j+1] = key;
        }
    }

    @Override
    public void printAll(int[] list, int size) {
        for(int i =0; i < size; i++)
            System.out.print(" " + list[i]);
    }
}

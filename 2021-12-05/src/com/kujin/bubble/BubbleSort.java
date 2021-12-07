package com.kujin.bubble;

import com.kujin.Sort;

public class BubbleSort extends Sort {

    int[] list;

    BubbleSort(int[] list) {
        this.list = list;
    }


    @Override
    public void sort(int[] list, int size) {
        int tmp=0;
        for(int i = size - 1; i >0; i--) {
            for(int j =0; j < i; j++) {
                if(list[j] > list[j + 1]){
                    swap(list[j], list[j+1], tmp);
                }
            }
        }
    }

    public void sortWithOutSwap(int[] list, int size) {
        System.out.println("----sort without swap-------");
        for(int i = size-1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(list[j] > list[j+1]) {
                    int tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
    }

    @Override
    public void printAll(int[] list, int size) {
        for(int i = 0; i < 10; i++)
            System.out.print(" " + list[i]);
    }
}

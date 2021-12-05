package com.kujin;

import java.util.ArrayList;

public class BubbleSort extends Swap{

    int[] list;

    BubbleSort(int[] list) {
        this.list = list;
    }

    void Sort(int size) {
        for(int i = size - 1; i >0; i--) {
            for(int j =0; j < i; j++) {
                if(list[j] > list[j + 1]){
                    int tmp = list[j];
                    list[j] = list[j + 1];
                    list[j+1] = tmp;
                }
            }
        }
    }

    void printList() {
        for(int i = 0; i < 10; i++)
            System.out.print(" " + list[i]);
    }

}

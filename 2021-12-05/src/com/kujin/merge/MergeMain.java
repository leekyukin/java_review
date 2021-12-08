package com.kujin.merge;

import com.kujin.Sort;

public class MergeMain  {
    public static void main(String[] args) {

        MergeSort MS = new MergeSort();

        int[] list = new int[] {1,9,2,7,8,3,7,5};
        MS.sort(list, 0, 7);
        MS.printAll(list, 8);
    }
}

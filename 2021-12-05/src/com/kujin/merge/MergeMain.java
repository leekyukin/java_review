package com.kujin.merge;

import com.kujin.Sort;

public class MergeMain  {
    public static void main(String[] args) {

        MergeSort MS = new MergeSort();

        int[] list = new int[] {1,9,2,7,8,3,7,5};

        System.out.println("정렬전-------------------");
        MS.printAll(list, 8);

        System.out.println("정렬후--------------------");
        MS.sort(list, 8);
        MS.printAll(list, 8);
    }
}

package com.kujin.selection;

public class SelectionMain {
    public static void main(String[] args) {

        SelectionSort SS = new SelectionSort();

        int[] list = new int[] {1,9,2,7,8,3,7,5};

        for(int i = 0; i < list.length; i++)
            System.out.print(" " + list[i]);

        SS.Sort(list, 8);

        System.out.println();
        System.out.println("정렬후 ----------------");

        SS.printAll(list, 8);

    }
}

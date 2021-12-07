package com.kujin.bubble;

public class BubbleMain {

    public static void main(String[] args) {



        int[] list = new int[] {1,2,6,2,3,4,1,2,3,4};

        BubbleSort BS = new BubbleSort(list);
        System.out.println("정렬전--------------------------");
        for(int i = 0; i < 10; i++)
            System.out.print(" " + list[i]);
        BS.sort(list, 10);

        System.out.println();
        System.out.println("정렬후 --------------------------");
        BS.printAll(list, 10);
        System.out.println();

        BS.sortWithOutSwap(list, 10);


        BS. printAll(list, 10);
    }
}

package com.kujin.quick;


public class QuickMain {
    public static void main(String[] args) {

        int[] list = new int[] {2,6,4,5,2,3,4,2,1,3};

        QuickSort QS = new QuickSort();

        System.out.println("정렬전-----------------");
        QS.printAll(list, 10);

        QS.sort(list, 10);

        System.out.println();
        System.out.println("정렬후----------------------");
        QS.printAll(list, 10);

    }
}

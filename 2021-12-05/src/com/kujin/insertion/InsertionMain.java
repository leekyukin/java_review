package com.kujin.insertion;

public class InsertionMain  {
    public static void main(String[] args) {

        InsertionSort IS = new InsertionSort();

        int[] list = new int[] {4,5,1,2,3,6,3,4,5,1,3,4,3};

        System.out.println();
        System.out.println("정렬전-------------------");
        IS.printAll(list,13);

        IS.sort(list, 13);

        System.out.println();
        System.out.println("정렬후--------------------");
        IS.printAll(list, 13);

    }
}

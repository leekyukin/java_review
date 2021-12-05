package com.kujin;

public abstract class Sort {

    public abstract void sort(int[] list, int size);

    public void sort(int[] list, int start, int end) {

    }

    public abstract void printAll(int[] list, int size);

    public void swap(int x, int y, int tmp) {
        tmp = x;
        x = y;
        y = tmp;
    }

}

package com.kujin._0116;

public class Loop implements Runnable {

    static int num;

    Loop(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        while(true) {
            num++;
        }
    }
}

package com.kujin._0110;

public class Thread0 implements Runnable {

    @Override
    public void run() {

        for(int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName());
        }

    }
}

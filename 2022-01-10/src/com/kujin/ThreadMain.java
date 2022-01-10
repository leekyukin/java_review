package com.kujin;

public class ThreadMain {
    public static void main(String[] args) {

        Runnable r0 = new Thread0();
        Thread t0 = new Thread(r0);

        Runnable r1 = new Thread1();
        Thread t1 = new Thread(r1);

        Runnable r2 = new Thread2();
        Thread t2 = new Thread(r2);

        t0.start();
        t1.start();
        t2.start();




    }
}

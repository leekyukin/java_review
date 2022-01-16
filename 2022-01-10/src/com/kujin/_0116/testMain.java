package com.kujin._0116;

public class testMain {

    public static void main(String[] args) {

        int num = 0;

        Runnable L = new Loop(num);
        Thread tl = new Thread(L);

        Runnable O = new Output(num);
        Thread to = new Thread(O);

        tl.start();
        to.start();

    }


}

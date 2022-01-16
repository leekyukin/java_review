package com.kujin._0116;

public class Output implements Runnable{

    static int num;
    Output(int num) {
        this.num = num;
    }


    @Override
    public void run() {
        while(true) {
            System.out.println(num);
        }
    }

}

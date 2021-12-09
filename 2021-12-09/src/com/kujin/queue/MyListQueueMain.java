package com.kujin.queue;

public class MyListQueueMain {
    public static void main(String[] args) {

        MyListQueue qList = new MyListQueue();
        qList.enQueue("A");
        qList.enQueue("B");
        qList.enQueue("C");
        qList.enQueue("D");
        qList.enQueue("E");


        qList.printAll();
        System.out.println(qList.deQueue() + "삭제");
        System.out.println(qList.deQueue() + "삭제");
        qList.printAll();
    }
}

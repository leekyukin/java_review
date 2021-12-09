package com.kujin.queue;

import com.kujin.linkedLIst.MyLinkedList;
import com.kujin.linkedLIst.MyListNode;
import com.kujin.linkedLIst.MyListNode;

public class MyListQueue extends MyLinkedList implements IQueue {


    private MyListNode front;
    private MyListNode rear;

    public MyListQueue() {
        front = null;
        rear = null;
    }

    @Override
    public void enQueue(String data) {
        MyListNode newNode;
        if(isEmpty()) {
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        }
        else  {
            newNode = addElement(data);
            rear.next = newNode;
            rear = newNode;
        }
    }

    @Override
    public String deQueue() {
        if(isEmpty()) {
            System.out.println("현재 큐가 비어있습니다.");
            return null;
        }
        String data = front.getData();
        front = front.next;
        if(front == null) {
            rear = null;
        }
        return data;
    }

    @Override
    public void printAll() {
        MyListNode tmp = front;
        while(tmp != null) {
            System.out.print(tmp.getData());
            if(tmp.next != null)
                System.out.print("->");
            tmp =tmp.next;
        }
        System.out.println();
    }
}

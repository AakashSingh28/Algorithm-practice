package com.other;

import java.util.LinkedList;

public class ProducerConsumer
{

    public static void main(String[] args) {

        final PC pc=new PC();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

    }



}

 class PC{

    private LinkedList linkedList=new LinkedList();
    int intialCapecity=5;
int count=0;
    public void produce() throws InterruptedException {
        synchronized (this){
            while (true) {

                if (linkedList.size()==intialCapecity)
                    wait();
                linkedList.add(count++);
                System.out.println("Producer  "+count);
                notify();
                Thread.sleep(1000);
            }
        }

    }


    public void consume()throws InterruptedException {
        synchronized (this){
            while (true) {
                if (linkedList.size() == 0)
                    wait();
               Object value= linkedList.removeFirst();
                System.out.println("Consumer "+value.toString());
                notify();
            }
        }
    }

}
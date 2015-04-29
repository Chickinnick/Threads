package com.company;

import java.util.concurrent.Executor;

public class Main {

    public static void main(String[] args) {


        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 1");
                    System.out.println(Thread.currentThread().getName() + i);

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "MY THREAD");
       // t.setDaemon(true);
        t.start();
        System.out.println("join");

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread finished");

    }
}











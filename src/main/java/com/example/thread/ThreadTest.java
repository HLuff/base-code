package com.example.thread;

public class ThreadTest implements Runnable {

    public static void main(String[] args) {
        Runnable r = new ThreadTest();
        Thread t1 = new Thread(r, "t1_name");
        Thread t2 = new Thread(r, "t2_name");
        t1.start();
        t2.start();
    }

    public void run() {
        for (int k = 0; k < 5; k++) {
            System.out.println(Thread.currentThread().getName() + " : for loop : " + k);
        }
        synchronized (this) {
            for (int k = 0; k < 5; k++) {
                System.out.println(Thread.currentThread().getName() + " : synchronized for loop : " + k);
            }
        }
    }
}

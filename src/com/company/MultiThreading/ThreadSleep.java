package com.company.MultiThreading;
class ThreadSleep1 implements Runnable {
    public void run() {
        int num =21;
        for (int i = 1; i < num; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
public class ThreadSleep {
    public static void main(String[] args) {
        ThreadSleep1 t1=new ThreadSleep1();
        Thread thread1 = new Thread(t1);
        thread1.start();
    }
}

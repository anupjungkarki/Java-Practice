package com.company.MultiThreading;

class ThreadRunnableOne implements Runnable{
    @Override
    public void run() {
        int num =2;
        for(int i=0 ; i<=num; i++){
            System.out.println("Thread " +  Thread.currentThread().getId() +" is Running");
        }
    }
}
class ThreadRunnableTwo implements Runnable{
    @Override
    public void run() {
        int num =3;
        for(int i=0 ; i<=num; i++){
            System.out.println("Thread " + Thread.currentThread().getId() +  " is Running");
        }
    }
}
public class ThreadByIMPRunnable {
    public static void main(String[] args) {
     ThreadRunnableOne t1  = new ThreadRunnableOne();
     Thread thread1 = new Thread(t1);
     ThreadRunnableTwo t2  = new ThreadRunnableTwo();
     Thread thread2 = new Thread(t2);
     thread1.start();
     thread2.start();
    }
}

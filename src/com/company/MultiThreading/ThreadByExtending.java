package com.company.MultiThreading;
import java.lang.*;
class ThreadOne extends Thread{
   public void run(){
        int num = 5;
        for(int i=0; i<=num ; i++){
         System.out.println("Thread 1 Is Running");
        }
    }
}
class ThreadTwo extends Thread{
    public void run(){
        int num = 2;
        for(int i=0; i<=num ; i++){
            System.out.println("Thread 2 Is Running");
        }
    }
}
public class ThreadByExtending {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        t1.start();
        t2.start();
    }
}

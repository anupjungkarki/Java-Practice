package com.company.MultiThreading;
public class MultiThreading extends Thread{

    public void run()
    {
        try{

            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }
        catch(Exception e){
            System.out.println("Exception is caught");
        }
    }
}
class Multithread{
    public static void main(String[] args){
        int n = 10;
        for(int i=0; i<n ; i++){
            Thread.yield();
            MultiThreading object = new MultiThreading();
            object.start();
        }
    }
}
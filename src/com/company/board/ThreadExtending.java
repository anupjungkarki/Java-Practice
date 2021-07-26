package com.company.board;
import java.lang.*;
class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread is running...........");
    }
}

public class ThreadExtending {
    public static void main(String[] args) {
                int num = 3;
                for(int i = 0 ; i<= num ; i++){
        Thread1 t1 = new Thread1();
        t1.start();
    }
    }
}

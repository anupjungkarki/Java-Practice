package com.company.board;
class Multiplication{
    synchronized void multiply(int num){
        for(int i= 1 ; i<=5 ;i++){
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println(num * i);
        }
    }
}

class T1 extends Thread {
     Multiplication m1;
     T1( Multiplication m1){
         this.m1 = m1;
     }
     public void run(){
       m1.multiply(5);
     }
}
class T2 extends Thread {
    Multiplication m1;
    T2( Multiplication m1){
        this.m1 = m1;
    }
    public void run(){
        m1.multiply(20);
    }
}

class Demo{
    public static void main(String[] args) {
        Multiplication obj = new Multiplication();
        T1 t1 = new T1(obj);
        T2 t2 = new T2(obj);
        t1.start();
        t2.start();
    }
}
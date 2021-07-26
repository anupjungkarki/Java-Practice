package com.company.ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args){
       int num1 = 10 , num2 =0,result;
       try{
           result = num1/num2;
       }
       catch (ArithmeticException e){
           System.out.println("You are not allow to divide number by 0");
       }
       finally {
           System.out.println("Finally Exception is Checked......");
       }
    }
}

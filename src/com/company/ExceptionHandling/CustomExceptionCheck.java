package com.company.ExceptionHandling;

class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}
public class CustomExceptionCheck {
   void check(int age) throws InvalidAgeException{
       if(age<=18){
           throw new InvalidAgeException("Not Valid for vote");
       }
       else{
           System.out.println("Valid for vote");
       }
   }

    public static void main(String[] args){
       CustomExceptionCheck obj = new CustomExceptionCheck();
       try{
          obj. check(10);
       }
       catch (InvalidAgeException e){
           System.out.println(e);
        }
    }
}

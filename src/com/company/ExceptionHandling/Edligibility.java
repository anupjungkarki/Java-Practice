package com.company.ExceptionHandling;

import java.io.IOException;

public class Edligibility {
    void check(int age , int weight) throws Exception {
        if(age<=18 && weight<=45){
            throw new IOException("Not Edligibile for Army");
        }
        else{
            System.out.println("Edligible");
        }
    }
    public static void main(String[] args) throws Exception {
        Edligibility obj = new Edligibility();
        obj.check(62,49);
    }
}

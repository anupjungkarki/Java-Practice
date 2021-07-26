package com.company.RMIProgram.PracticeRMI;
import java.rmi.*;
public class MyClient{
    public static void main(String args[]){
        try{
            AdderServerInterface stub= (AdderServerInterface) Naming.lookup("rmi://localhost:6666/test");
            System.out.println(stub.add(34,4));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
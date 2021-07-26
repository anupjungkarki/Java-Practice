package com.company.RMIProgram.GreatestFind;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        Greatest stub = (Greatest) Naming.lookup("rmi://localhost/6000");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = stub.greatest_number(x,y);
        System.out.println("The greatest Number is:"+ result);
    }
}

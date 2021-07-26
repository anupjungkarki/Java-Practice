package com.company.RMIProgram.AddSub;

import java.rmi.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Rem rem_obj = (Rem) Naming.lookup("rmi://localhost/Rem");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum is:"+ rem_obj.add(x , y));
        System.out.println("Sub is:"+ rem_obj.sub(x , y));
    }
}

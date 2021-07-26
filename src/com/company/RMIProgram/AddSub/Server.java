package com.company.RMIProgram.AddSub;

import java.rmi.*;

public class Server {
    public static void main(String[] args) throws Exception {
        RemImpl local_obj = new RemImpl();
        Naming.rebind("rmi:///Rem",local_obj);
        System.out.println("Server  is ready");
    }
}

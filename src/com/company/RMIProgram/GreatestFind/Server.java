package com.company.RMIProgram.GreatestFind;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        GreatestImpl gi = new GreatestImpl();
        Naming.rebind("rmi://localhost/6000",gi);
        System.out.println("Server is Ready");
    }
}

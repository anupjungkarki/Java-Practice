package com.company.RMIProgram.PracticeRMI;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

class AdderRemote extends UnicastRemoteObject implements AdderServerInterface {

    public AdderRemote() throws RemoteException {
        super();
    }

    @Override
    public int add(int x, int y) throws RemoteException {
        return x+y;
    }
    public static void main(String[] args) {
        try{
            AdderServerInterface stub=  new AdderRemote();
            Naming.rebind("rmi://localhost:6666/test", stub);
            System.out.println("Server is Ready");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}


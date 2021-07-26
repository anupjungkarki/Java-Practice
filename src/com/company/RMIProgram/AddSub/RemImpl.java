package com.company.RMIProgram.AddSub;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemImpl extends UnicastRemoteObject implements Rem{
    public  RemImpl() throws RemoteException{
        super();
    }

    @Override
    public int add(int x, int y) throws RemoteException {
        return x+y;
    }

    @Override
    public int sub(int x, int y) throws RemoteException {
        return x-y;
    }
}

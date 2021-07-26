package com.company.RMIProgram.GreatestFind;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GreatestImpl extends UnicastRemoteObject implements Greatest {
    GreatestImpl() throws  RemoteException{
        super();
    }

    @Override
    public int greatest_number(int x, int y) throws RemoteException {
        return Math.max(x, y);
    }
}

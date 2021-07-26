package com.company.RMIProgram.GreatestFind;

import java.rmi.*;

public interface Greatest extends Remote {
    public int greatest_number(int x, int y) throws RemoteException;
}

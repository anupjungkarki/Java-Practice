package com.company.RMIProgram.PracticeRMI;

import java.rmi.*;
public interface AdderServerInterface extends Remote {
    int add(int x, int y) throws RemoteException;
}

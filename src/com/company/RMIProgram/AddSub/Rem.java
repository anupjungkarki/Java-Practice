package com.company.RMIProgram.AddSub;
import java.rmi.*;
public interface Rem extends Remote{
    public int add(int x , int y) throws RemoteException;
    public int  sub(int x , int y) throws RemoteException;
}

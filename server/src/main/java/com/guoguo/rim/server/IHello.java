package com.guoguo.rim.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHello extends Remote {
    public String sayHello(String msg) throws RemoteException;
}
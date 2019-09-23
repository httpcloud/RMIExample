package com.guoguo.rim.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements IHello {
    public HelloImpl() throws RemoteException {
        super();
    }
    public String sayHello(String msg) throws RemoteException {
        System.out.println("Connected sucessfully!");
        return "hello，" + msg + "!";
    }
}
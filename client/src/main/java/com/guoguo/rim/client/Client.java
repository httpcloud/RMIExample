package com.guoguo.rim.client;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import com.guoguo.rim.server.IHello;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String args[]) {
        try {
            //server ip
            IHello hello = (IHello) Naming.lookup("rmi://127.0.0.1:888/hello");
            System.out.println(hello.sayHello("guoguo"));
        } catch (NotBoundException e) {
        	e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
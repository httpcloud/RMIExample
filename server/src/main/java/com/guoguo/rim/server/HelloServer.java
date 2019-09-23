package com.guoguo.rim.server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class HelloServer {
    public static void main(String args[]) {
        try {
            IHello hello = new HelloImpl();
            LocateRegistry.createRegistry(888);
            System.setProperty("java.rmi.server.hostname","127.0.0.1");
            Naming.bind("rmi://localhost:888/hello", hello);
            System.out.println("远程IHello对象绑定成功！");
        } catch (RemoteException e) {
            System.out.println("创建远程对象异常！");
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            System.out.println("已经绑定过了！！");
            e.printStackTrace();
        } catch (MalformedURLException e) {
            System.out.println("发生 URL 异常！");
            e.printStackTrace();
        }
    }
}
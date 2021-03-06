package main;

import messages.Message;
import user.User;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatClientInterface extends Remote {

    public void receivePublicMessage(Message message) throws RemoteException;

    public void receivePrivateMessage(Message message) throws RemoteException;

    public void addUser(User user) throws RemoteException;

    public void removeUser(User user) throws RemoteException;

    public void receiveUserList(Message message) throws RemoteException;

}

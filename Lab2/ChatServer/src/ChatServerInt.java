import java.rmi.*;
import java.util.*;

public interface ChatServerInt extends Remote{
    public boolean login (ChatClientInt a)throws RemoteException ;
    public void publish (String s)throws RemoteException ;
    public Vector getConnected() throws RemoteException ;
    public boolean disconnect (ChatClientInt a)throws RemoteException;
    public void banUser(String s) throws RemoteException ;
    public void unbanUser(String s) throws RemoteException ;
    public ArrayList getBannedUsers() throws RemoteException ;
}
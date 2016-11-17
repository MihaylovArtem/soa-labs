import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class ChatServer  extends UnicastRemoteObject implements ChatServerInt{

    private Vector v=new Vector();
    private ArrayList<String> banned = new ArrayList<String>();
    public ChatServer() throws RemoteException{}

    public boolean login(ChatClientInt a) throws RemoteException{
        System.out.println(a.getName() + "  got connected....");
        a.tell("You have Connected successfully.");
        publish(a.getName()+ " has just connected.");
        v.add(a);
        return true;
    }

    public boolean disconnect(ChatClientInt a) throws RemoteException{
        System.out.println(a.getName() + " got disconnected...");
        a.tell("You have Connected successfully.");
        publish(a.getName()+ " has just disconnected.");
        v.remove(a);
        return true;
    }

    public void banUser(String s) throws RemoteException {
        if (banned.contains(s)) {
            return;
        }
        banned.add(s);
        System.out.println(s + " got banned!");
        String curUsers = "Banned Users:\n";
        ArrayList v = banned;
        if(v!=null) for (int i=0;i<v.size();i++){
            try{  String tmp=((ChatClientInt)v.get(i)).getName();
                curUsers += tmp;
                curUsers += "\n";
            }catch(Exception e){e.printStackTrace();}
        }
        System.out.println(curUsers);

    }

    public void unbanUser(String s) throws RemoteException {
        banned.remove(s);
        System.out.println(s + " got unbanned!");
    }

    public ArrayList getBannedUsers() throws RemoteException {
        return banned;
    }

    public void publish(String s) throws RemoteException{
        System.out.println(s);
        for(int i=0;i<v.size();i++){
            try{
                ChatClientInt tmp=(ChatClientInt)v.get(i);
                tmp.tell(s);
            }catch(Exception e){
                //problem with the client not connected.
                //Better to remove it
            }
        }
    }

    public Vector getConnected() throws RemoteException{
        return v;
    }
}
import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import java.io.Console;
import java.rmi.Naming;
import java.util.*;

public class ChatUI{
    public ChatClient client;
    public ChatServerInt server;
    public void doConnect(){
        if (connect.getText().equals("Connect")){
            if (name.getText().length()<2){JOptionPane.showMessageDialog(frame, "You need to type a name."); return;}
            if (ip.getText().length()<2){JOptionPane.showMessageDialog(frame, "You need to type an IP."); return;}
            try{
                client=new ChatClient(name.getText());
                client.setGUI(this);
                server=(ChatServerInt)Naming.lookup("rmi://"+ip.getText()+"/mychat");
                server.login(client);
                connect.setText("Disconnect");
            }catch(Exception e){e.printStackTrace();JOptionPane.showMessageDialog(frame, "ERROR, we wouldn't connect....");}
        }else {
            try {
                server.disconnect(client);
                connect.setText("Connect");
            } catch (Exception e){e.printStackTrace();JOptionPane.showMessageDialog(frame, "ERROR, we wouldn't connect....");}
        }
    }

    public void sendText(){
        if (connect.getText().equals("Connect")){
            JOptionPane.showMessageDialog(frame, "You need to connect first."); return;
        }
        String st=tf.getText();
        tf.setText("");
        //Remove if you are going to implement for remote invocation
        try{
            if (st.equals("/getUserList") && client.getName().equals("admin")) {
                client.getUsers();
                return;
            }
            if (st.length() > 6 && st.substring(0,4).equals("/ban") && client.getName().equals("admin")) {
                server.banUser(st.substring(5,st.length()));
                return;
            }
            if (st.length() > 8 && st.substring(0,6).equals("/unban") && client.getName().equals("admin")) {
                System.out.println(st.substring(7,st.length()));
                server.unbanUser(st.substring(7,st.length()));
                return;
            }
            if (st.equals("/getBanned") && client.getName().equals("admin")) {
                String curUsers = "Banned Users:\n";
                ArrayList<String> v = server.getBannedUsers();
                if(v!=null) for (int i=0;i<v.size();i++){
                    try{  String tmp=v.get(i);
                        curUsers += tmp;
                        curUsers += "\n";
                    }catch(Exception e){e.printStackTrace();}
                }
                JOptionPane.showMessageDialog(frame, curUsers);
                return;
            }
            if (server.getBannedUsers().contains(client.getName())) {
                JOptionPane.showMessageDialog(frame, "You are banned in this chat.");
            } else {
                st = "[" + name.getText() + "] " + st;
                server.publish(st);
            }
        }catch(Exception e){e.printStackTrace();}
    }

    public void writeMsg(String st){  tx.setText(tx.getText()+"\n"+st);  }

    public void showUsersList(Vector v) {
        String curUsers = "Current Users:\n";
        if(v!=null) for (int i=0;i<v.size();i++){
            try{  String tmp=((ChatClientInt)v.get(i)).getName();
                curUsers += tmp;
                curUsers += "\n";
            }catch(Exception e){e.printStackTrace();}
        }
        JOptionPane.showMessageDialog(frame, curUsers);
    }

    public static void main(String [] args){
        ChatUI c=new ChatUI();
    }
    //User Interface code.
    public ChatUI(){
        frame=new JFrame("Group Chat");
        JPanel main =new JPanel();
        JPanel top =new JPanel();
        JPanel cn =new JPanel();
        JPanel bottom =new JPanel();
        ip=new JTextField();
        ip.setText("localhost");
        tf=new JTextField();
        name=new JTextField();
        tx=new JTextArea();
        connect=new JButton("Connect");
        JButton bt=new JButton("Send");
        lst=new JList();
        main.setLayout(new BorderLayout(5,5));
        top.setLayout(new GridLayout(1,0,5,5));
        cn.setLayout(new BorderLayout(5,5));
        bottom.setLayout(new BorderLayout(5,5));
        top.add(new JLabel("Your name: "));top.add(name);
        top.add(new JLabel("Server Address: "));top.add(ip);
        top.add(connect);
        cn.add(new JScrollPane(tx), BorderLayout.CENTER);
        cn.add(lst, BorderLayout.EAST);
        bottom.add(tf, BorderLayout.CENTER);
        bottom.add(bt, BorderLayout.EAST);
        main.add(top, BorderLayout.NORTH);
        main.add(cn, BorderLayout.CENTER);
        main.add(bottom, BorderLayout.SOUTH);
        main.setBorder(new EmptyBorder(10, 10, 10, 10) );
        //Events
        connect.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ doConnect();   }  });
        bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ sendText();   }  });
        tf.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ sendText();   }  });

        frame.setContentPane(main);
        frame.setSize(600,300);
        frame.setVisible(true);
    }
    JTextArea tx;
    JTextField tf,ip, name;
    JButton connect;
    JList lst;
    JFrame frame;
}
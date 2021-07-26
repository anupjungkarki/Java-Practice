package com.company.ProgrammingSocket;
import java.io.*;
import java.net.*;

class server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket client_socket = ss.accept();
        DataInputStream din = new DataInputStream(client_socket.getInputStream());
        DataOutputStream dout = new DataOutputStream(client_socket.getOutputStream());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1="" , str2="";
        while(!str1.equals("stop")){
            str1 = din.readUTF();
            System.out.println("Client Says:"+ str1);
            str2 = reader.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        ss.close();
        client_socket.close();
        din.close();
    }
}

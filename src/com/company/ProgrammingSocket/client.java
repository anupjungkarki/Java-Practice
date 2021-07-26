package com.company.ProgrammingSocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class client {
    public static void main(String[] args) throws IOException {
        Socket client_socket = new Socket("localhost",8888);
        DataInputStream din = new DataInputStream(client_socket.getInputStream());
        DataOutputStream dout = new DataOutputStream(client_socket.getOutputStream());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1="" , str2="";
        while(!str1.equals("stop")){
            str1 = reader.readLine();
            dout.writeUTF(str1);
            dout.flush();
            str2 = din.readUTF();
            System.out.println("Server Says:"+ str2);
        }
        client_socket.close();
        din.close();
    }
}

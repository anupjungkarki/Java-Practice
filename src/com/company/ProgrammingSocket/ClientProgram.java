package com.company.ProgrammingSocket;
import java.io.*;
import java.net.*;
class MyClient{
    public static void main(String[] args){
        try {
            Socket client_socket = new Socket("localhost", 6666);
            DataInputStream din = new DataInputStream(client_socket.getInputStream());
            String str = din.readUTF();
            System.out.println("Server Say:" + str);
            client_socket.close();
        }
       catch (Exception e){
            System.out.println(e);
       }
    }
}
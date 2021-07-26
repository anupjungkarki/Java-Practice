package com.company.ProgrammingSocket;
import java.net.*;
import java.io.*;
 class MyServer{
     public static void main(String[] args){
         try{
             ServerSocket server_socket = new ServerSocket(6666);
             Socket client_socket =server_socket.accept();
             DataOutputStream dout = new DataOutputStream(client_socket.getOutputStream());
             dout.writeUTF("Hello");
             dout.flush();
             dout.close();
             client_socket.close();
         }
         catch (Exception e){
             System.out.println(e);
         }
     }
 }
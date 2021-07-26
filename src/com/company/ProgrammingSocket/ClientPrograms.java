package com.company.ProgrammingSocket;

import java.io.*;
import java.net.*;
class ClientPrograms {
    public  static  void main(String[] args) throws IOException{
        Socket client_socket = new Socket("localhost",6666);
        DataInputStream data_in = new DataInputStream(client_socket.getInputStream());
        DataOutputStream data_out = new DataOutputStream(client_socket.getOutputStream());
        BufferedReader buffer_reader = new BufferedReader(new InputStreamReader(System.in));
        String str1 ="" , str2 ="";
        while(!str1.equals("stop")){
            str1 = buffer_reader.readLine();
            data_out.writeUTF(str1);
            data_out.flush();
            str2 = data_in.readUTF();
            System.out.println("Server Says:"+ str2);
        }
        data_out.close();
        client_socket.close();
    }
}

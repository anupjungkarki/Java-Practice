package com.company.ProgrammingSocket;
import java.io.*;
import java.net.*;
class ServerPrograms {
    public static void main(String[] args) throws IOException {
            ServerSocket server_socket = new ServerSocket(6666);
            Socket client_socket = server_socket.accept();
            DataInputStream data_in = new DataInputStream(client_socket.getInputStream());
            DataOutputStream data_out = new DataOutputStream(client_socket.getOutputStream());
            BufferedReader buffer_reader = new BufferedReader(new InputStreamReader(System.in));
            String str1="" , str2 = "";
            while(!str1.equals("stop")){
              str1 = data_in.readUTF();
              System.out.println("Client Say:" + str1);
              str2 = buffer_reader.readLine();
              data_out.writeUTF(str2);
              data_out.flush();
            }
            data_in.close();
            server_socket.close();
            client_socket.close();
        }
}

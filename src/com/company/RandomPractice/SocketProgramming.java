package com.company.RandomPractice;

import java.io.IOException;
import java.net.ServerSocket;

public class SocketProgramming {
    public static void main(String[] args) throws IOException {
        try{
            ServerSocket ss = new ServerSocket(666);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
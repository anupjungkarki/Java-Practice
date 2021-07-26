package com.company.JavaIO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class DataInputStreamsClass {
    public static void main(String[] args) throws IOException{
        FileInputStream file = new FileInputStream("anup.txt");
        DataInputStream din = new DataInputStream(file);
        String result = din.readUTF();
        System.out.println(result);
        file.close();
        din.close();
    }
}

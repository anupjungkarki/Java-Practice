package com.company.JavaIO;
import java.io.*;
class DataOutputStreamClass{
    public static void main(String[] args) throws IOException{
        FileOutputStream file = new FileOutputStream("anup.txt");
        DataOutputStream dout = new DataOutputStream(file);
        String data = "Hello Anup Jung Karki";
        dout.writeUTF(data);
        dout.flush();
        dout.close();
    }
}

package com.company.JavaIO;

import java.io.*;

public class SolveFile2016 {
    public static void main(String[] args) throws IOException{
        FileOutputStream file = new FileOutputStream("purbanchal.dat");
        DataOutputStream out = new  DataOutputStream(file);
        out.writeUTF("I am Student of BIT VI semester");
        System.out.println("Writing Success..");
        FileInputStream f = new FileInputStream("purbanchal.dat");
        DataInputStream din = new DataInputStream(f);
        String str = din.readUTF();
        System.out.println(str);
        out.flush();
        din.close();
        file.close();
        f.close();
    }
}

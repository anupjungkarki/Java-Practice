package com.company.JavaIO;
import java.io.*;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws IOException{
        FileOutputStream file = new FileOutputStream("ex.txt");
        DataOutputStream dout = new DataOutputStream(file);
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        dout.writeUTF(str);
        file.close();
        dout.close();
    }
}

package com.company.JavaIO;
import java.io.*;
public class BufferReaderClass {
    public static void main(String[] args) throws IOException{
        FileReader file = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(file);
        String result = br.readLine();
        System.out.println(result);
        br.close();
        file.close();
    }
}


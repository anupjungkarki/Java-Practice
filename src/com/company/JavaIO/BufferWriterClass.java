package com.company.JavaIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterClass {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("file.txt");
        BufferedWriter bw = new BufferedWriter(file);
        bw.write("Hello Buffer Writer");
        bw.close();
        file.close();
        System.out.println("Writing Complete Successfully..");
    }
}

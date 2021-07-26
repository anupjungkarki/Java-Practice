package com.company.JavaIO;
import java.io.*;

class Main {
    public static void main(String[] args) throws  IOException {
            FileOutputStream output = new FileOutputStream("output.txt");
            String data = "This is a anup of text inside the file.";
            byte[] array = data.getBytes();
            // Writes byte to the file
            output.write(array);
            output.close();
        }
    }

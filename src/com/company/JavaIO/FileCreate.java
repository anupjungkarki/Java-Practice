package com.company.JavaIO;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) throws IOException {
        File fs = new File("test.txt");
        if(fs.createNewFile()){
            System.out.println("File Created Successfully!!");
        }
        else {
            System.out.println("File Already Exist!!");
        }
    }
}

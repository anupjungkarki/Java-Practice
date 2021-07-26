package com.company.Serialization;

import java.io.*;

public class Deserializations {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("serialize.txt");
        ObjectInputStream read = new ObjectInputStream(file);
        Student s1 = (Student)read.readObject();
        System.out.println(s1.name + s1.roll + s1.Address);
        file.close();
    }
}

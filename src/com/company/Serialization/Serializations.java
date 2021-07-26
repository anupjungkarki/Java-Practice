package com.company.Serialization;

import java.io.*;
class Student implements Serializable{
    String name;
    int roll;
    String Address;
    Student(String n, int r , String add){
        this.name = n;
        this.roll = r;
        this.Address = add;
    }
}
public class Serializations {
    public static void main(String args[])throws Exception
    {
        Student s1=new Student("Anup",12,"Solukhumbu");
        OutputStream file=new FileOutputStream("serialize.txt");
        ObjectOutputStream out=new ObjectOutputStream(file);
        out.writeObject(s1);
        out.flush();
        file.close();
        System.out.println("success..");

    }

}

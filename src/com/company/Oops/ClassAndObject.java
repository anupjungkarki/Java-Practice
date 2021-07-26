package com.company.Oops;
class Student{
    int rollno;
    String name;
    void insertRecord(int r, String n){
        rollno = r;
        name = n;
    }
    void DisplayStudentInfo(){
        System.out.println("Student name: "+ name + " Rollno is: "+ rollno);
    }
}
public class ClassAndObject {
    public static void main(String[] args){
        Student obj = new Student();
        obj.insertRecord(1,"Anup Karki");
        obj.DisplayStudentInfo();
    }
}

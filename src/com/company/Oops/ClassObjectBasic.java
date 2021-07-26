package com.company.Oops;

class StudentData{
    int id;
    int roll;
    String name;
    String level;
}
public class ClassObjectBasic {
   public static void main(String[] args){
       StudentData s = new StudentData();
       s.id = 1;
       s.roll = 2;
       s.name = "Anup Karki";
       s.level = "Bachelor";
       System.out.println(s.id);
   }
}

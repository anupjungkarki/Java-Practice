package com.company.board;

class ClassAndObject {
    int rollno;
    int marks;
    void student(int r , int m){
        rollno = r;
        marks = m;
    }

    void show_details(){
        System.out.println("The" + rollno + marks);
    }
    public static void main(String[] args) {
        ClassAndObject obj = new ClassAndObject();
        obj.student(1 , 80);
        obj.show_details();
    }
}

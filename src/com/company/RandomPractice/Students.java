package com.company.RandomPractice;

public class Students {
    int id;
    String name,address;
    public static void main(String[] args){
        Students st = new Students();
        st.id = 2;
        st.name = "Anup Karki";
        st.address = "Nepal";
        System.out.println(st.name + " id is " + st.id + " and address is " + st.address);
    }
}

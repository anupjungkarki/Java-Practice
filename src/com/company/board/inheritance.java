package com.company.board;
class Parents{
     int id;
     String name;
     void data_items(int id_no , String n){
         id = id_no;
         name = n;
     }

     void display_student(){
         System.out.println(id + name);
    }
}
class Children extends  Parents{
    public static void main(String[] args) {
     Children obj = new Children();
     obj.data_items(11 , " Anup");
     obj.display_student();
    }
}

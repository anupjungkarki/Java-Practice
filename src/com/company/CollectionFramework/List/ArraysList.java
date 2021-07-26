package com.company.CollectionFramework.List;

import java.util.ArrayList;

public class ArraysList{
    public static void main(String[] args){
      ArrayList<String> arr = new ArrayList<>();
      arr.add("Python");
      arr.add("Django");
      arr.add("JavaScript");
      arr.add("React");
      System.out.println("The list of array is:"+ arr);
      // Traversing and accessing using iterator
        for(String programs : arr){
            System.out.println(programs);
        }
        // It will remove the vale
        arr.remove(1);
        System.out.println(arr);
        //  set will replace the vale in the particular index
        arr.set(1,"Java");
        System.out.println(arr);
    }
}

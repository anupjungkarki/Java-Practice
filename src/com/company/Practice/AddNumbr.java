package com.company.Practice;

import java.util.Scanner;

public class AddNumbr implements Sum{
    public void Addition(int x){
        int result = 0;
        int average = 0;
        for(int i=1 ; i<=x ;i ++){
        result = result + i;
        }
        System.out.println("The sum is:" +result);
        average = result/x;
        System.out.println("Average is:" +average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n Number to Add:");
        int x = sc.nextInt();
        AddNumbr obj = new AddNumbr();
        obj.Addition(x);
    }
}

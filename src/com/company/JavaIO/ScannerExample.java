package com.company.JavaIO;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){
        float result;
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Your Name:");
//        String name = input.next();
//        int age = input.nextInt();
//        System.out.println(name + age);
//        input.close();
        System.out.println("Enter First Number:");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = input.nextInt();
        result = num1+num2;
        System.out.println("The Sum is:" + result);
    }
}

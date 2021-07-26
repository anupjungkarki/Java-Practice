package com.company.JavaIO;

import java.io.*;
class MyInput
{
    public static void main(String[] args) throws IOException {
        String text;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        text = br.readLine();    //Reading String
        System.out.println(text);
    }
}
package com.company.RandomPractice;

public class ForEachLoop {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, -4, 9 ,8};
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        System.out.println(sum);
    }
}

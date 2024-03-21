package com.athang.javatraining.basicjava;

import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Obtained marks of the students: ");
        int a = scanner.nextInt();
        if(a >= 75 && a<=100){
                System.out.println("Distinction");
        }
        else if(a >= 60 && a<=100 ){
            System.out.println("1st Division");
        }
        else if(a >= 50 && a<=100){
            System.out.println("2nd Division");
        }
        else if(a >= 40 && a<=100 ){
            System.out.println("3rd Division");
        }
        else if(a < 40 && a>0 ){
            System.out.println("Fail");
        }
        else if(a<0 || a>100){
            System.out.println("Enter a valid marks");
        }
    }
}

package com.athang.javatraining.basicjava;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Enter a Number to see the multiplication table");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int a = 1;

        while(a <= 10){
            int mul = a * i;
            System.out.println( i+" X "+a + " = " + mul);
            a++;

        }

    }
}

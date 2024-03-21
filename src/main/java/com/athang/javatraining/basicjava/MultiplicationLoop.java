package com.athang.javatraining.basicjava;

import java.util.Scanner;

public class MultiplicationLoop {
    public static void main(String[] args) {
        MultiplicationLoop ml = new MultiplicationLoop();
        ml.mult();
    }
    public static void mult(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for(int a = 1; a<=10; a++){
            int ans = a * i;
            System.out.println(a+ "X"+ i+ "=" +ans);
        }
    }
}


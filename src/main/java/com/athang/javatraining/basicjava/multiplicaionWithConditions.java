package com.athang.javatraining.basicjava;

import java.util.Scanner;

// Condition 1: Display M.T upto 20 and only of even numbers
// Condition 2: If the input number is 12 print M.T up to only 10
// Condition 3: Use only one for loop to solve it using break and continue
public class multiplicaionWithConditions {
    public static void main(String[] args) {
        multiplicaionWithConditions mm = new multiplicaionWithConditions();
        mm.displayMultiplication();
    }
    private void displayMultiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        for (int i=1; i<=20; i++){
            if(i%2!=0){
                continue;
            }
            if(number ==12 && i==10){
                break;
            }
            System.out.println(number+ "X" +i+"=" +number*i);
        }
    }
}
